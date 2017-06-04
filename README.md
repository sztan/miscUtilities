# miscUtilities

`ListUtilities.divide` splits a `List` into a number of subLists, given a sourceList and a wished target size
for the subLists  


**Example**

{
List sourceList = new LinkedList();
Object obj = new Object();
sourceList = ListDivider.divide(new ArrayList(Arrays.asList(1, 2, "stan", obj)), 3);
}

will return

`[[1, 2, stan], [java.lang.Object@6d06d69c]]`


**Usage**

once the `.jar` added to your project, use :

`import import com.stan.listUtilities.ListDivider;`

       
