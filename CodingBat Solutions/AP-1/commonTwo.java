public int commonTwo(String[] a, String[] b) {
  LinkedList<String> a1 = new LinkedList<String>();
  LinkedList<String> a2 = new LinkedList<String>();
  for(int i=0;i<a.length;i++)
  if(!a1.contains(a[i]))
  a1.add(a[i]);
  
  for(int i=0;i<b.length;i++)
  if(!a2.contains(b[i]))
  a2.add(b[i]);
  
  int count =0;
  Collections.sort(a1);
  Collections.sort(a2);
  for(int i=0;i<a2.size();i++)
  if(a1.contains(a2.get(i)))
  count++;
  return count;
}
