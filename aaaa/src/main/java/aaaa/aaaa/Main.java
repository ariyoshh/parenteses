package aaaa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Desafio {
  public void teste(String input_str) {
    Stack<Character> s = new Stack<Character>();
    for (char st : input_str.toCharArray()) {
      if (st == '(' || st == '{' || st == '[') {
        s.push(st);
      }
      else {
          if(s.empty()) {
            System.out.println(input_str + 
            " - Invalido");
            return;
          }
          else{
          char top = (Character) s.peek();
          if(st == ')' && top == '(' ||
          st == '}' && top == '{' ||
          st == ']' && top == '['){
            s.pop();
          }
		  /*fuedab*/
          else{
            System.out.println(input_str + 
            " - Invalido");
            return;
          }
        }
      }
    }
    if(s.empty()) {
      System.out.println(input_str + 
      " - Ok");
    }
    else{
      System.out.println(input_str + 
      " - Invalido");
    }
  }
  public static void main(String[] args) throws IOException {
      BufferedReader in = new BufferedReader(new FileReader("L://hehe.txt"));
      String input = null;
      StringBuilder sb = new StringBuilder();
      while ((input = in.readLine()) != null) {
          sb.append(input);
      }
      new Desafio().teste(sb.toString());
  }
}