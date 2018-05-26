public int userCompare(String aName, int aId, String bName, int bId) {
  if(!aName.equals(bName)){
    if(aName.compareTo(bName)>0)
    return 1;
    if(aName.compareTo(bName)<0)
    return -1;
  }
  if(aName.equals(bName)){
    if(aId==bId)
    return 0;
    if(aId>bId)
    return 1;
    else
    return -1;
  }
  return 0;
}
