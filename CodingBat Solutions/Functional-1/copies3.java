public List<String> copies3(List<String> strings) {
  strings.replaceAll(n->n+n+n);
  return strings;
}
