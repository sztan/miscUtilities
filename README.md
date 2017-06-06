# miscUtilities

`ListUtilities.divide` splits a `List` into a number of subLists, given a sourceList and a wished target size
for the subLists  


**Example code**

```
List targetList = new LinkedList();
Object obj = new Object();
targetList = ListDivider.divide(new ArrayList(
                                    Arrays.asList(1,
                                        2,
                                        "stan",
                                        obj)
                                    ),
                                3); // split into parts of 3

// returns : [[1, 2, stan], [java.lang.Object@6d06d69c]]
targetList = new LinkedList();
targetList = ListDivider.divide(new ArrayList(
                                        Arrays.asList(
                                            1,
                                            2,
                                            Arrays.asList(
                                                "cat",
                                                "brick"),
                                            Arrays.asList("stan", obj),
                                            2,
                                            1000,
                                            33
                                        )
                                    ),
                                3);
// returns : [[1, 2, [cat, brick]], [[stan, java.lang.Object@6d06d69c], 2, 1000], [33]]
```


**Usage**

once the `.jar` added to your project, use :

`import com.stan.listUtilities.ListDivider;`

       
