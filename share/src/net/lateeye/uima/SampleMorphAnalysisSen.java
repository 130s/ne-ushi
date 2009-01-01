package net.lateeye.uima;

import java.io.IOException;
import java.util.HashSet;

import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceSpecifier;
import org.apache.uima.util.InvalidXMLException;
import org.apache.uima.util.XMLInputSource;

public class SampleMorphAnalysisSen {

	public SampleMorphAnalysisSen(String propPath, String text) {

		AnalysisEngine ae = null;
		JCas jcas = null;
		XMLInputSource componentDescriptor = null;

		try {
			componentDescriptor = new XMLInputSource(propPath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ResourceSpecifier specifier = UIMAFramework.getXMLParser()
					.parseResourceSpecifier(componentDescriptor);
			ae = UIMAFramework.produceAnalysisEngine(specifier);
		} catch (InvalidXMLException e) {
			e.printStackTrace();
		} catch (ResourceInitializationException e) {
			e.printStackTrace();
		}

		try {
			jcas = ae.newJCas();
			jcas.setDocumentText(text); // analyze a document
			ae.process(jcas);
		} catch (AnalysisEngineProcessException e) {
			e.printStackTrace();
		} catch (ResourceInitializationException e) {
			e.printStackTrace();
		}

		FSIndex index = jcas.getJFSIndexRepository().getAnnotationIndex(
				Annotation.type);
		FSIterator annotIter = index.iterator();
		HashSet<String> annotArray = new HashSet<String>();
		while (annotIter.hasNext()) {
			Annotation annot = (Annotation) annotIter.next();
			annotArray.add(annot.getCoveredText());
			System.out.println(this.getClass().getName() + ": "
					+ annot.getClass().getName() + " " + annot.getCoveredText()
					+ " " + annot.getBegin() + " " + annot.getEnd());
		}
	}

	public static void main(String[] args) {
		String descPath = args[0];
		// String inText = "今日はダラスも晴れると良いな．";
		/*
		 * String inText = "大政奉還は古臭いシステムで、まあどうでもいいが、" +
		 * "それで社員がまとまるという幻想があるのだろうか？日本の天皇制みたいなものか？と、" +
		 * "その辺はどうでも良くて、トヨタバブルがアメリカの過剰消費に支えられていたというのは、" +
		 * "そのとおりである。しかも割賦販売という金融システムにも支えられていたし、" +
		 * "住宅バブルで金借りて住宅買ったのに、担保価値が上がって、" + "さらに金を借りて自動車を買っていたわけで、それによって、" +
		 * "トヨタの空前の好業績は支えられていたわけだ。";
		 */
		//String inText = "	中華料理は世界一旨い!! （北京編）";
		//String inText =		"これは、北京でよく食べるのか、北京ダック屋の金百万でもあるのだが、多分もともとは遊牧民の料理、モンゴルとかウイグルなどの地域のものじゃないかな。。めちゃめちゃ食べがいがあるし、肉もおいしい。羊の肉って日本だと高いからクリスマスくらいしか食べない。こっちでは安いし生活に浸透している。中国でも北のほうはもともと遊牧民がいた地域だからだろう。";
		String inText =		"トヨタが創業家帰りしたようですね。<br>で、おととい位に発表したのが<br>大きなボックスカー・・・・。２種類あったな。<br>あかん・・・・・。逆やろ・・・・。<br><br>今、消費者が欲しがっている車は<br>むしろ、一人乗りとか二人乗りとかで<br>良いから小さくて燃費のかからない車。<br>手頃で、場所も取らず、スピードだって<br>そんなに出なくて良い、タウンカー。<br>違いますか？<br><br>数年前に、レクサスという高級路線に入った<br>時に、私は、逆だろうとつぶやいていました。<br><br>昔は家族皆でお出かけだったけれど、<br>今は一緒に暮らしていてもやりたい事はそれぞれ違って、出かけたい先もバラバラなのです。<br>作りたいものを作っていないで、消費者の<br>欲しいものを作ればいつまでも売れる車を<br>作れたはずですよね。<br>それにしても・・・今回の派遣切りなど、本当に<br>やってはいけないことをしてますね。<br>トップの経営判断の失敗を、一番末端の<br>社員に押し付けている・・・・。それではブランド<br>価値もがた落ちですね。<br><br></p>";
		new SampleMorphAnalysisSen(descPath, inText);
	}
}
