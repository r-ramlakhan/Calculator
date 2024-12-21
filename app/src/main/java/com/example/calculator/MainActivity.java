package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView tvInputWindow = findViewById(R.id.tvInputWindow);
        TextView tvOutputWindow = findViewById(R.id.tvOutputWindow);
        Button btn0 = findViewById(R.id.btn0);
        Button btn00 = findViewById(R.id.btn00);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnOpenBr = findViewById(R.id.btnOpenBr);
        Button btnCloseBr = findViewById(R.id.btnCloseBr);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnAC = findViewById(R.id.btnAC);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnEqual = findViewById(R.id.btnEqual);

        btn0.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._0);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btn00.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._00);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btn1.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._1);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btn2.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._2);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btn3.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._3);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btn4.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._4);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });


        btn5.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._5);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btn6.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._6);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });


        btn7.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._7);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btn8.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._8);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btn9.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string._9);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btnOpenBr.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string.openBr);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btnCloseBr.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string.closeBr);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btnDiv.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string.div);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btnMul.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string.mul);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btnAdd.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string.add);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btnSub.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString() + getString(R.string.sub);
            if (str.length() <= 7) {
                tvInputWindow.setText(str);
            } else if (str.length() <= 10) {
                tvInputWindow.setTextSize(60);
                tvInputWindow.setText(str);
            } else {
                tvInputWindow.setTextSize(40);
                tvInputWindow.setText(str);
            }
        });

        btnAC.setOnClickListener(v -> {
            tvInputWindow.setText("");
            tvInputWindow.setTextSize(80);
            tvOutputWindow.setText("");
        });

        btnClear.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString();
            if (!str.isEmpty()) {
                if (str.length() <= 8) {
                    tvInputWindow.setTextSize(80);
                    tvInputWindow.setText(str.substring(0, str.length() - 1));
                } else if (str.length() <= 11) {
                    tvInputWindow.setTextSize(60);
                    tvInputWindow.setText(str.substring(0, str.length() - 1));
                } else {
                    tvInputWindow.setTextSize(40);
                    tvInputWindow.setText(str.substring(0, str.length() - 1));
                }
            }
        });

        btnEqual.setOnClickListener(v -> {
            String str = tvInputWindow.getText().toString();
            String expression = str.replace('×', '*').replace('÷', '/');

            if (validExpression(expression)) {
                String res = calculate(expression);
                tvOutputWindow.setText(res);
            } else {
                tvOutputWindow.setText(getString(R.string.invalid_expression));
            }

        });
    }

    private String calculate(String expression) {
        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                operands.push(String.valueOf(sb));
                i--;
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    performOperation(operands, operators);
                }
                operators.pop();
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    performOperation(operands, operators);
                }
                operators.push(c);
            }
        }
        while (!operators.isEmpty()) {
            performOperation(operands, operators);
        }
        return operands.pop();
    }

    private void performOperation (Stack < String > operands, Stack < Character > operators){
        int operand2 = Integer.parseInt(operands.pop());
        int operand1 = Integer.parseInt(operands.pop());
        char operator = operators.pop();

        switch (operator) {
            case '+':
                operands.push(String.valueOf(operand1 + operand2));
                break;
            case '-':
                operands.push(String.valueOf(operand1 - operand2));
                break;
            case '*':
                operands.push(String.valueOf(operand1 * operand2));
                break;
            case '/':
                if (operand2 == 0) {
                    operands.push("Cannot divide by zero");
                } else {
                    double res = operand1 / (double) operand2;
                    operands.push(String.valueOf(res));

                }
        }
    }
    private boolean isOperator ( char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int precedence ( char operator){
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
    private boolean validExpression (String expression){
        if ((!Character.isDigit(expression.charAt(0)) && expression.charAt(0) != '(') ||
                (!Character.isDigit(expression.charAt(expression.length() - 1)) && expression.charAt(expression.length() - 1) != ')'))
        {
            return false;
        }

        for (int i = 0; i < expression.length() - 1; i++) {
            if ((!Character.isDigit(expression.charAt(i)) && expression.charAt(i) == '(') &&
                    (!Character.isDigit(expression.charAt(i + 1)) && expression.charAt(i + 1) == ')')) {
                return false;
            }
        }
        return true;
    }

}