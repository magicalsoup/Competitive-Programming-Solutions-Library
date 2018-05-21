public int triangle(int rows) {
  if(rows==0)
  return 0;
  if(rows==1)
  return 1;
  return triangle(rows-1)+rows;
}
