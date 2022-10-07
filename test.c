#include<stdio.h>
#include<stdlib.h>
#include<sys/wait.h>
#include<sys/types.h>

bool checkNT(int n)
{
    if(n<2) return false;
    int sq = sqrt(num);
    for(int i=2;i <=sq ;i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;
}
bool checkSquareNumber(int n){
    if(n<1)
        return false;
    int i = sqrt(n);
    if(i*i==n)
        return true;
    return false;
}
int main(int argc, char const *argv[])
{
	int num = atoi(argv[1]);
	pid_t pid = fork();
	if(pid == 0) { // children
		for(int i=1;i<num;i++){
        	if(checkNT(i) == true){
         		printf("%d ", i);		
        	}
        }
	}	
	if(pid > 0) { // parent
		wait(NULL);
		for(int i=1;i<num;i++){
        	if(checkNT(i) == true){
         		printf("%d ", i);		
        	}
        }

	}
	return 0;
}