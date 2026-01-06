Use Philipp Lackners Bookpedia KMP example to showcase a solution for a KoinIsolatedContext, that survives config changes.

* The KoinIsolatedContext is used in the BookDetailScreen(Root). When book details are opened a new random 
password string is generated. 
* When the orientation changes (or another config change occurs), the generated password stays the same. 