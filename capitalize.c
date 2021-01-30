#include <stdio.h>
int main()
{
    int t   ;
    scanf("%d", &t);
    char str[50];
	
    while(t--){
        scanf(" %[^\n]s",str);
  
    printf("%s\n",str);
    }
    return 0;
}
