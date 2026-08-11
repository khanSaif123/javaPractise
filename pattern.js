// // const readline = require("readline")

// // const rl = readline.createInterface({
// //   input: process.stdin,
// //   output: process.stdout
// // })

// // rl.question("Enter your age: ", (input) => {
// //   let age = Number(input);

// // })

// let month = [
//   "January",
//   "Feb",
//   "March",
//   "April",
//   "May",
//   "June",
//   "July",
//   "Aug",
//   "Sep",
//   "Oct",
//   "Nov",
//   "Dec",
// ];

// const readline = require("readline");

// let rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout,
// });

// rl.question("Enter Month Number: ", (monthNumber) => {
//   console.log("Month number: ", monthNumber);

//   if(monthNumber >= 1 && monthNumber <= 12){
//     let monthIs = month[monthNumber - 1];
//     console.log(monthIs);
//   }else {
//     console.log('Invalid month number');
//   }
// });

// let printStar = 5;
// let lines = 4;
// let lineCount = 0;
// let star = "";

// while(lineCount < lines){
//     for(let i = 1; i<=printStar; i++){

//       if(star.length < printStar){
//          star = star + "*";
//       }

//     }
//     console.log(star)
//     lineCount++;

// }

const { stdout, stdin } = require("process");
const readline = require("readline");

let rl = readline.createInterface({
  input: stdin,
  output: stdout,
});

rl.question("Enter your input: ", (input1) => {
  console.log(typeof input1);
  const numbers = input1.split(" ").map((n) => Number(n));
  // numbers.map((n1, n2, n3) => {
  //   return n1;
  // })
  console.log(numbers);
});
