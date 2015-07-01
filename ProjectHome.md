# Abstract #
NeUshi is an programming interface specification and its implementation which enables programmers to handle easily the output of Morphological Analysis(MA) modules. Using MA modules through NeUshi, a programmer receives the module's process result encapsulated in Apache UIMA objects, which enables to get the elements contained in the result just by calling functions that correspond. NeUshi will contribute to reduce the cost of time to develop applications since a programmer doesn't need to do string-processing to handle the result of MA modules which output their result in unstructured string format in most cases.

(in Japanese)
NeUshi は形態素解析(MA)モジュールの処理結果をアプリケーション開発者がより扱い易い形式で出力するためのプログラミングインタフェイス仕様とその実装です. NeUshi を介して MA モジュールを操作すると, 処理結果を構造化された Apache UIMA のオブジェクトとして出力するため, 処理結果に含まれる各要素が, 対応する各関数を呼ぶのみで取り出せます. 構造の無い String 形式で処理結果を出力する多くの MA モジュールにおいて, その出力結果を扱う際の文字列処理が不要となり, アプリケーション開発と運用にかかる時間の短縮を期待できます.

# List of descriptions #
  * **Target User**: A developer who incorporates morphological analysis module into an application, and moreover either the one who can accept the result of morph-analysis by the object in Apache UIMA style / who is willing to make use of UIMA
  * **Implemented interface** (As of Jan 01 2009): MeCab and Sen (both are Japanese morphological analyzers. Hopefully in the near future Stanford parser will be implemented.)
  * **Approximate required cost for creating new interface by yourself**: the author took only 4 hours from he started writing the code until he got ready for testing when he created an NeUshi interface for MeCab.
  * **Assisting documents**: This package includes a sample program that may help coding

(in Japanese)
  * **想定ユーザ**: 形態素解析を組み込むアプリの開発者で, 形態素解析結果を Apache UIMA オブジェクトで受け取ることに抵抗が無い / UIMA のメリットを享受したいと思ってらっしゃる方
  * **対応済の形態素解析モジュール**: MeCab, Sen (09年1月1日現在. 今後 Stanford Parser 対応予定, 時期未定)
  * **新たな形態素解析モジュールの I/F 作成の工数見積り時のヒント**: 筆者は MeCab の NeUshi I/F のコーディング開始からテスト実施可能状態になるまで 4時間でした. NeUshi に習熟していることを除いても比較的短時間で実装可能と思われます
  * **開発支援ドキュメント**: コーディングの参考にできるサンプルアプリケーション同梱

# Install #
See [INSTALL.txt](http://code.google.com/p/ne-ushi/wiki/INSTALL) that is also included in distribution package

# Design #
See DesignOfFramework.

# Application example(in Japanese) #
例えば MeCab 自体を一般的な操作方法で実行した結果は, 入力文 _"今日のアーリントンは大雨のち晴れ，気温は 20℃近くまで上がりました．"_ に対して次の様な String の standard output になります.
```
今日	名詞,副詞可能,*,*,*,*,今日,キョウ,キョー
の	助詞,連体化,*,*,*,*,の,ノ,ノ
アーリントン	名詞,固有名詞,地域,一般,*,*,アーリントン,アーリントン,アーリントン
は	助詞,係助詞,*,*,*,*,は,ハ,ワ
大雨	名詞,一般,*,*,*,*,大雨,オオアメ,オーアメ
のち	名詞,副詞可能,*,*,*,*,のち,ノチ,ノチ
晴れ	動詞,自立,*,*,一段,連用形,晴れる,ハレ,ハレ
，	記号,読点,*,*,*,*,，,，,，
気温	名詞,一般,*,*,*,*,気温,キオン,キオン
は	助詞,係助詞,*,*,*,*,は,ハ,ワ
20	名詞,数,*,*,*,*,*
℃	名詞,サ変接続,*,*,*,*,*
近く	形容詞,自立,*,*,形容詞・アウオ段,連用テ接続,近い,チカク,チカク
まで	助詞,副助詞,*,*,*,*,まで,マデ,マデ
上がり	動詞,自立,*,*,五段・ラ行,連用形,上がる,アガリ,アガリ
まし	助動詞,*,*,*,特殊・マス,連用形,ます,マシ,マシ
た	助動詞,*,*,*,特殊・タ,基本形,た,タ,タ
．	記号,句点,*,*,*,*,．,．,．
EOS
```
したがって MeCab を利用したアプリケーションの開発者が処理結果の特定箇所を抜き出すためには, この output を文字列処理するプログラムを開発の都度作成することになりがちです. しかし NeUshi は上記 output を一行ごと(形態素ごと)にオブジェクトとして返します. 例えば地域を表す語を抽出したい場合は, NeUshi 経由で得た MeCab の出力結果をもとにして次のような短いコードを書くだけです.
```
String key_mecab_location = "地域";
FSIterator annotationIterator = jcas.getJFSIndexRepository().getAnnotationIndex(Morpheme.type).iterator();
while (annotationIterator.hasNext()) {
 Morpheme annot = (Morpheme) annotationIterator.next();
 if (key_mecab_location.equals(annot.getSpeechSubType())
     || key_mecab_location.equals(annot.getSpeechSubSubType())
     || key_mecab_location.equals(annot.getSpeechSubSubSubType())) {
  System.out.println("Local: " + annot.getLex());
 }
}
```
実行結果
```
Local: アーリントン
```

# Origin of the name "NeUshi" #
The title of the component "NeUshi" or "子丑" is an abbreviation of "Nlp Extension of Uima Interface"("S" and "H" has not yet come up...). Pronunciation: neh-woo-shee. NeUshi consists of 2 consecutive chinese zodiacs and correspond to zodiacs of the year 2008 and 2009, when the project owner took time for implementation. This project was published on January 1, 2009 approx 9am(CDT) in Dallas, Texas.


---

Comments should be sent to neUshi-users at googlegroups.com.