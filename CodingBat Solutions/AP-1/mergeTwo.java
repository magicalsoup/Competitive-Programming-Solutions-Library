public String[] mergeTwo(String[] a, String[] b, int n) {
  String ans[] = new String[n];
  LinkedList<String>list = new LinkedList<String>();
  for(int i=0;i<a.length;i++)
  list.add(a[i]);
  for(int i=0;i<b.length;i++)
  if(!list.contains(b[i]))
  list.add(b[i]);
  Collections.sort(list);
  for(int i=0;i<n;i++)
  ans[i] = list.get(i);
  return ans;
}
