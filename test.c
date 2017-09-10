#include<stdio.h>

enum baz_val { TRUE, FALSE, BAZ };

void baz_print(enum baz_val v) {

  if(v == TRUE)
  {
      printf("v\n");
  }
  else printf("YOU ARE WRONG!\n");
}
int main(void)
{
}