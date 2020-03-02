package com.example.restservice.model;

public class GreetingInput {
  private String greeting;
  private String name;

  public GreetingInput(String greeting, String name) {
    this.greeting = greeting;
    this.name = name;
  }

  /**
   * @return the greeting
   */
  public String getGreeting() {
    return greeting;
  }

  /**
   * @param greeting the greeting to set
   */
  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return this.greeting + ' ' + this.name + '!';
  }
}