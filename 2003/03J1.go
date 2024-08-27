package main

import (
	"fmt"
	"strings"
)

func main() {
	var t, s, h int
	fmt.Scan(&t, &s, &h)

	// Build space variable
	space := strings.Repeat(" ", s)

	// Print the tines (using t and s)
	for i := 0; i < t; i++ {
		fmt.Printf("*%s*%s*\n", space, space)
	}

	// Print horizontal bar
	fmt.Println(strings.Repeat("*", 3+s*2))

	// Rebuild space for the sides of the handle
	space = strings.Repeat(" ", 1+s)

	// Print the handle (using h)
	for i := 0; i < h; i++ {
		fmt.Printf("%s*\n", space)
	}
}
