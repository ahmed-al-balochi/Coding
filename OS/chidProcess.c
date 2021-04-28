#include <sys/types.h>
#include <stdio.h>
#include <unistd.h>
int main(){
    pid_t pid;
    pid = fork();
    if(pid < 0){
        fprintf(stderr,"Fork Faild");
        return 1;
    }
    else if(pid == 0){
        execlp("/bin/alacritty", "alacritty", NULL);
    }
    else{
        wait(NULL);
        execlp("/bin/nemo", "nemo", NULL);
        printf("Child Is Created");
        printf("Now Executing parent");
        execlp("/bin/nemo", "nemo", NULL);
    }
    return 0;
}
