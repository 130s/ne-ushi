# Class and component diagram of whole system #
![http://ne-ushi.googlecode.com/svn/trunk/share/doc/classDiagram_systemOverall.png](http://ne-ushi.googlecode.com/svn/trunk/share/doc/classDiagram_systemOverall.png)

NeUshi has basically 2 layers: **abstract I/F class** and **implemented I/F class**.
  * **Abstract I/F class**: has common procedures which might be used by all I/Fs of any morphological analysis(MA) module. _MorphologicalAnalysisAnnotator_falls under this category in the image above.
  * **Implementd I/F class**: describes the specific procedures that are necessary for using each concrete MA modules, such as initialization, input target data, process the output data. _MorphAnalysisMecabAnnotator_and following two classes corresponds here
When a developer creates a new different morphological analysis module, create a class that extends MorphologicalAnalysisAnnotator. Moreover acutually, due to the specification of UIMA, a developer also need to prepare so-called a **component descriptor**, other than writing codes. See [HowtoCreateNewIF](http://code.google.com/p/ne-ushi/wiki/HowtoCreateNewIF) for details.


---

# Class diagram of type systems #
![http://ne-ushi.googlecode.com/svn/trunk/share/doc/classDiagram_typeSystem.png](http://ne-ushi.googlecode.com/svn/trunk/share/doc/classDiagram_typeSystem.png)

Type system is UIMA's concept and each type system represents an smallest element of structured information. In NeUshi, morphemes correspond to type systems.
Currently(as of Jan 01 2009), the design of type systems in NeUshi is based on Japanese language which has (assumedly) more numbers and complicated structure of morphemes than English. That means the current design covers not only Japanese but also English, so in most cases of when a developer creates another I/F, she/he doesn't need to add/edit existing type systems.

If a developer need to add new morphemes, follow the Apache UIMA's instruction of how to use **type system descriptor** and edit type systems.