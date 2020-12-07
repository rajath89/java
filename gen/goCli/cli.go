package main

import (
  "fmt"
  "log"
  "os"

  "github.com/urfave/cli"
)

func mkfile(rec string){
  var g string

  g=`

import java.util.Scanner;

public class`+" "+rec+`{


	public static void p(Object s){
	   System.out.println(s);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	}
}
`

    f, err := os.Create(rec+".java")

    if err != nil {
        log.Fatal(err)
    }

    defer f.Close()

    _, err2 := f.WriteString(g)

    if err2 != nil {
        log.Fatal(err2)
    }

    fmt.Println("file created")
  
 
}

func main() {
  app := &cli.App{
    Name: "greet",
    Usage: "fight the loneliness!",
    Action: func(c *cli.Context) error {
      
	record := c.Args().Get(0)
	mkfile(record)
      return nil
    },
  }

  err := app.Run(os.Args)
  if err != nil {
    log.Fatal(err)
  }
}
