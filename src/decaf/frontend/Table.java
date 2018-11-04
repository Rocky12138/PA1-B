/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: D:\decaf_PA1_B\src\decaf\frontend\Parser.spec
 * Options: unstrict mode
 * Generated at: Sun Nov 04 18:53:48 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 13
    public static final int BOOL = 258; //# line 13
    public static final int INT = 259; //# line 13
    public static final int STRING = 260; //# line 13
    public static final int CLASS = 261; //# line 13
    public static final int NULL = 262; //# line 14
    public static final int EXTENDS = 263; //# line 14
    public static final int THIS = 264; //# line 14
    public static final int WHILE = 265; //# line 14
    public static final int FOR = 266; //# line 14
    public static final int IF = 267; //# line 15
    public static final int ELSE = 268; //# line 15
    public static final int RETURN = 269; //# line 15
    public static final int BREAK = 270; //# line 15
    public static final int NEW = 271; //# line 15
    public static final int PRINT = 272; //# line 16
    public static final int READ_INTEGER = 273; //# line 16
    public static final int READ_LINE = 274; //# line 16
    public static final int LITERAL = 275; //# line 17
    public static final int IDENTIFIER = 276; //# line 18
    public static final int AND = 277; //# line 18
    public static final int OR = 278; //# line 18
    public static final int STATIC = 279; //# line 18
    public static final int INSTANCEOF = 280; //# line 18
    public static final int LESS_EQUAL = 281; //# line 19
    public static final int GREATER_EQUAL = 282; //# line 19
    public static final int EQUAL = 283; //# line 19
    public static final int NOT_EQUAL = 284; //# line 19
    public static final int SCOPY = 285; //# line 22
    public static final int SEALED = 286; //# line 22
    public static final int GUARDOR = 287; //# line 22
    public static final int VAR = 288; //# line 22
    public static final int ARRAYINIT = 289; //# line 22
    public static final int ARRAYCONCAT = 290; //# line 23
    public static final int IN = 291; //# line 23
    public static final int DEFAULT = 292; //# line 23
    public static final int FOREACH = 293; //# line 23
    public static final int LBRA = 294; //# line 23
    public static final int RBRA = 295; //# line 23
    
    public static final int VariableDef = 296;
    public static final int ExprT5 = 297;
    public static final int Oper8 = 298;
    public static final int BoundVariable = 299;
    public static final int Oper3 = 300;
    public static final int Oper6 = 301;
    public static final int VariableList = 302;
    public static final int Formals = 303;
    public static final int Oper7 = 304;
    public static final int IfSubStmt = 305;
    public static final int Expr8 = 306;
    public static final int AfterSimpleTypeExpr = 307;
    public static final int AfterIf = 308;
    public static final int Expr2 = 309;
    public static final int Oper2 = 310;
    public static final int BoolExprForComp = 311;
    public static final int ExprT10 = 312;
    public static final int Expr6 = 313;
    public static final int Expr11 = 314;
    public static final int BreakStmt = 315;
    public static final int ExprT2 = 316;
    public static final int StmtList = 317;
    public static final int Constant = 318;
    public static final int SubVariableList = 319;
    public static final int PrintStmt = 320;
    public static final int ConstantList = 321;
    public static final int ForStmt = 322;
    public static final int Expr9 = 323;
    public static final int Expr1 = 324;
    public static final int ForeachStmt = 325;
    public static final int ArrayConstant = 326;
    public static final int AfterExpr = 327;
    public static final int GuardedStmt = 328;
    public static final int ConstantListT = 329;
    public static final int Oper1 = 330;
    public static final int ElseClause = 331;
    public static final int FieldList = 332;
    public static final int IfBranch = 333;
    public static final int SubExprList = 334;
    public static final int Expr10 = 335;
    public static final int AfterParenExpr = 336;
    public static final int ClassDef = 337;
    public static final int ReturnStmt = 338;
    public static final int ExprList = 339;
    public static final int StmtBlock = 340;
    public static final int FunctionField = 341;
    public static final int AfterIdentExpr = 342;
    public static final int Oper9 = 343;
    public static final int Program = 344;
    public static final int Expr = 345;
    public static final int Type = 346;
    public static final int Expr5 = 347;
    public static final int AfterNewExpr = 348;
    public static final int Assignment = 349;
    public static final int ExtendsClause = 350;
    public static final int Oper5 = 351;
    public static final int ArrayType = 352;
    public static final int BoolExprForeach = 353;
    public static final int GuardMiddleExpr = 354;
    public static final int Expr3 = 355;
    public static final int Actuals = 356;
    public static final int Variable = 357;
    public static final int ExprT3 = 358;
    public static final int Stmt = 359;
    public static final int AfterBracket = 360;
    public static final int SimpleStmt = 361;
    public static final int AfterReverseBracket = 362;
    public static final int ExprT7 = 363;
    public static final int SimpleType = 364;
    public static final int WhileStmt = 365;
    public static final int ExprT1 = 366;
    public static final int Expr4 = 367;
    public static final int ExprT4 = 368;
    public static final int ReturnExpr = 369;
    public static final int IfStmt = 370;
    public static final int OCStmt = 371;
    public static final int ExprT6 = 372;
    public static final int ExprT8 = 373;
    public static final int Expr7 = 374;
    public static final int ClassList = 375;
    public static final int Oper4 = 376;
    public static final int Field = 377;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 296;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "SCOPY", "SEALED",
        "GUARDOR", "VAR", "ARRAYINIT", "ARRAYCONCAT", "IN",
        "DEFAULT", "FOREACH", "LBRA", "RBRA", "VariableDef",
        "ExprT5", "Oper8", "BoundVariable", "Oper3", "Oper6",
        "VariableList", "Formals", "Oper7", "IfSubStmt", "Expr8",
        "AfterSimpleTypeExpr", "AfterIf", "Expr2", "Oper2", "BoolExprForComp",
        "ExprT10", "Expr6", "Expr11", "BreakStmt", "ExprT2",
        "StmtList", "Constant", "SubVariableList", "PrintStmt", "ConstantList",
        "ForStmt", "Expr9", "Expr1", "ForeachStmt", "ArrayConstant",
        "AfterExpr", "GuardedStmt", "ConstantListT", "Oper1", "ElseClause",
        "FieldList", "IfBranch", "SubExprList", "Expr10", "AfterParenExpr",
        "ClassDef", "ReturnStmt", "ExprList", "StmtBlock", "FunctionField",
        "AfterIdentExpr", "Oper9", "Program", "Expr", "Type",
        "Expr5", "AfterNewExpr", "Assignment", "ExtendsClause", "Oper5",
        "ArrayType", "BoolExprForeach", "GuardMiddleExpr", "Expr3", "Actuals",
        "Variable", "ExprT3", "Stmt", "AfterBracket", "SimpleStmt",
        "AfterReverseBracket", "ExprT7", "SimpleType", "WhileStmt", "ExprT1",
        "Expr4", "ExprT4", "ReturnExpr", "IfStmt", "OCStmt",
        "ExprT6", "ExprT8", "Expr7", "ClassList", "Oper4",
        "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {VOID, CLASS, INT, STRING, BOOL},
        {ARRAYINIT, Integer.valueOf(']'), FOR, ARRAYCONCAT, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {VAR, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{'), Integer.valueOf('(')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {AND},
        {IF, RBRA},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER, LBRA},
        {BREAK},
        {AND, Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {LITERAL, NULL, Integer.valueOf('['), Integer.valueOf(']')},
        {FOR},
        {Integer.valueOf('-'), Integer.valueOf('!'), LBRA, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {FOREACH},
        {Integer.valueOf('[')},
        {Integer.valueOf(':'), Integer.valueOf(']')},
        {Integer.valueOf('{')},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {GUARDOR, Integer.valueOf('}')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {LBRA, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, CLASS},
        {CLASS, SEALED},
        {RETURN},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {CLASS, SEALED},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {ARRAYINIT},
        {Integer.valueOf('['), IDENTIFIER},
        {WHILE, Integer.valueOf(')')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf('}')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(')')},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), READ_INTEGER, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{'), SCOPY, IF, FOREACH},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, VAR, Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT, DEFAULT},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {INT, VOID, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {ARRAYCONCAT, Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(';')},
        {Integer.valueOf('(')},
        {SCOPY},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), FOR, ARRAYCONCAT, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), ARRAYINIT},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {CLASS, SEALED, eof, eos},
        {ARRAYCONCAT},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 296);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, ARRAYCONCAT, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IN},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {GUARDOR, Integer.valueOf('}')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {RBRA},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(']'), FOR, ARRAYCONCAT, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {CLASS, SEALED, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {LBRA, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {eof, eos},
        {Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {IDENTIFIER},
        {Integer.valueOf(']'), FOR, ARRAYCONCAT, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(')')},
        {Integer.valueOf('}')},
        {Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), IN, Integer.valueOf(')')},
        {Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), LBRA, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, ARRAYCONCAT, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), ARRAYINIT},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, RBRA, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {eof, eos},
        {Integer.valueOf('!'), LBRA, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 296);
    }
    
    public Table() {
        for (int i = 0; i < 82; i++) {
            begin.add(new HashSet<>(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet<>(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Map.Entry<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 49
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 607
            case ExprT5: {
                switch (lookahead) {
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case RBRA:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 438
            case Oper8: {
                switch (lookahead) {
                    case '*':
                        return new AbstractMap.SimpleEntry<>(3, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new AbstractMap.SimpleEntry<>(4, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new AbstractMap.SimpleEntry<>(5, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 271
            case BoundVariable: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList(VAR, IDENTIFIER));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(Variable));
                    default: return null;
                }
            }
            //# line 378
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(8, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 404
            case Oper6: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(13, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 169
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 159
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList());
                    default: return null;
                }
            }
            //# line 426
            case Oper7: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 333
            case IfSubStmt: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 682
            case Expr8: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 891
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(21, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 287
            case AfterIf: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(23, Arrays.asList(GuardedStmt));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(IfStmt));
                    default: return null;
                }
            }
            //# line 503
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 371
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(26, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 867
            case BoolExprForComp: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(27, Arrays.asList(IF, Expr));
                    case RBRA:
                        return new AbstractMap.SimpleEntry<>(28, Arrays.asList());
                    default: return null;
                }
            }
            //# line 746
            case ExprT10: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(29, Arrays.asList(Integer.valueOf('['), AfterBracket));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(30, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT10));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '-':
                    case RBRA:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 624
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(32, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 821
            case Expr11: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(33, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(35, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(37, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(38, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(39, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    case LBRA:
                        return new AbstractMap.SimpleEntry<>(41, Arrays.asList(LBRA, Expr, FOR, IDENTIFIER, IN, Expr, BoolExprForComp, RBRA));
                    default: return null;
                }
            }
            //# line 1002
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(42, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 515
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(43, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case FOR:
                    case RBRA:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 196
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case LBRA:
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 915
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList(LITERAL));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(48, Arrays.asList(NULL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList(ArrayConstant));
                    default: return null;
                }
            }
            //# line 179
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1034
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 935
            case ConstantList: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList(Constant, ConstantListT));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList());
                    default: return null;
                }
            }
            //# line 996
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 711
            case Expr9: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(56, Arrays.asList(Oper9, Expr10));
                    case LBRA:
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList(Expr10));
                    default: return null;
                }
            }
            //# line 474
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(58, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 255
            case ForeachStmt: {
                switch (lookahead) {
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(59, Arrays.asList(FOREACH, Integer.valueOf('('), BoundVariable, IN, Expr, BoolExprForeach, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 929
            case ArrayConstant: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(60, Arrays.asList(Integer.valueOf('['), ConstantList, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 790
            case AfterExpr: {
                switch (lookahead) {
                    case ':':
                        return new AbstractMap.SimpleEntry<>(61, Arrays.asList(Integer.valueOf(':'), Expr, Integer.valueOf(']'), ExprT10));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList(Integer.valueOf(']'), AfterReverseBracket));
                    default: return null;
                }
            }
            //# line 297
            case GuardedStmt: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList(Integer.valueOf('{'), GuardMiddleExpr, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 947
            case ConstantListT: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(64, Arrays.asList(Integer.valueOf(','), Constant, ConstantListT));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(65, Arrays.asList());
                    default: return null;
                }
            }
            //# line 364
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(66, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 1014
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case LBRA:
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case '}':
                    case IDENTIFIER:
                    case NEW:
                    case GUARDOR:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 119
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList());
                    default: return null;
                }
            }
            //# line 318
            case IfBranch: {
                switch (lookahead) {
                    case GUARDOR:
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList(GUARDOR, IfSubStmt, IfBranch));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList());
                    default: return null;
                }
            }
            //# line 977
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(73, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(74, Arrays.asList());
                    default: return null;
                }
            }
            //# line 721
            case Expr10: {
                switch (lookahead) {
                    case LBRA:
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(75, Arrays.asList(Expr11, ExprT10));
                    default: return null;
                }
            }
            //# line 903
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(76, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(77, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr11));
                    default: return null;
                }
            }
            //# line 102
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(78, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(SEALED, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 1021
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(80, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 969
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 190
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(82, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 151
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(83, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 814
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(85, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case RBRA:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 455
            case Oper9: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(87, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(88, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 27
            case Program: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(89, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 468
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(90, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 83
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(91, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 595
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(92, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 877
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(93, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 355
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(95, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 112
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(97, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 397
            case Oper5: {
                switch (lookahead) {
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList(ARRAYINIT));
                    default: return null;
                }
            }
            //# line 92
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(100, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList());
                    default: return null;
                }
            }
            //# line 261
            case BoolExprForeach: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(102, Arrays.asList(WHILE, Expr));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(103, Arrays.asList());
                    default: return null;
                }
            }
            //# line 303
            case GuardMiddleExpr: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(104, Arrays.asList(IfSubStmt, IfBranch));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList());
                    default: return null;
                }
            }
            //# line 532
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(106, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 959
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(107, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList());
                    default: return null;
                }
            }
            //# line 55
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(109, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 544
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(110, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case FOR:
                    case RBRA:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 204
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(112, Arrays.asList(VariableDef));
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(114, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(116, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(117, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(118, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(119, Arrays.asList(StmtBlock));
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(120, Arrays.asList(OCStmt));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(121, Arrays.asList(IF, AfterIf));
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(122, Arrays.asList(ForeachStmt));
                    default: return null;
                }
            }
            //# line 775
            case AfterBracket: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(123, Arrays.asList(Expr, AfterExpr));
                    default: return null;
                }
            }
            //# line 340
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(124, Arrays.asList(Expr, Assignment));
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(125, Arrays.asList(VAR, IDENTIFIER, Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 803
            case AfterReverseBracket: {
                switch (lookahead) {
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case RBRA:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(127, Arrays.asList(ExprT10));
                    case DEFAULT:
                        return new AbstractMap.SimpleEntry<>(128, Arrays.asList(DEFAULT, Expr11, ExprT10));
                    default: return null;
                }
            }
            //# line 665
            case ExprT7: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(129, Arrays.asList(Oper7, Expr8, ExprT7));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case RBRA:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 61
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(132, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(133, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(134, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(135, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 990
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(136, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 486
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(137, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case FOR:
                    case RBRA:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 561
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList(Expr5, ExprT4));
                    default: return null;
                }
            }
            //# line 578
            case ExprT4: {
                switch (lookahead) {
                    case ARRAYCONCAT:
                        return new AbstractMap.SimpleEntry<>(140, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case FOR:
                    case RBRA:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1027
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1008
            case IfStmt: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(144, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 281
            case OCStmt: {
                switch (lookahead) {
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList(SCOPY, Integer.valueOf('('), IDENTIFIER, Integer.valueOf(','), Expr, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 636
            case ExprT6: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList(Oper6, Expr7, ExprT6));
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case RBRA:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 694
            case ExprT8: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(148, Arrays.asList(Oper8, Expr9, ExprT8));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '-':
                    case RBRA:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 653
            case Expr7: {
                switch (lookahead) {
                    case '!':
                    case LBRA:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList(Expr8, ExprT7));
                    default: return null;
                }
            }
            //# line 38
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(151, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList());
                    default: return null;
                }
            }
            //# line 390
            case Oper4: {
                switch (lookahead) {
                    case ARRAYCONCAT:
                        return new AbstractMap.SimpleEntry<>(153, Arrays.asList(ARRAYCONCAT));
                    default: return null;
                }
            }
            //# line 135
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(154, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(155, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 50
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 608
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 2: {
                /* no action */
                return;
            }
            case 3: {
                //# line 439
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 4: {
                //# line 444
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 5: {
                //# line 449
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 6: {
                //# line 272
                params[0].stmt = new Tree.Var(params[2].ident, params[2].loc);
                return;
            }
            case 7: {
                //# line 276
                params[0].stmt = params[1].vdef;
                return;
            }
            case 8: {
                //# line 379
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 384
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 405
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 410
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 12: {
                //# line 415
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 13: {
                //# line 420
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 14: {
                //# line 170
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 15: {
                //# line 160
                params[0].vlist = params[1].vlist;
                return;
            }
            case 16: {
                //# line 164
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 17: {
                //# line 427
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 18: {
                //# line 432
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 19: {
                //# line 334
                params[0].expr = params[1].expr;
                params[0].stmt = params[3].stmt;
                return;
            }
            case 20: {
                //# line 683
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 21: {
                //# line 892
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 22: {
                //# line 897
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 23: {
                //# line 288
                params[0].stmt = params[1].stmt;	
                return;
            }
            case 24: {
                //# line 292
                params[0].stmt = params[1].stmt;
                return;
            }
            case 25: {
                //# line 504
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 26: {
                //# line 372
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 27: {
                //# line 868
                params[0].expr = params[2].expr;
                return;
            }
            case 28: {
                //# line 872
                params[0] = new SemValue();
                return;
            }
            case 29: {
                //# line 747
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                if (params[2].expr1 != null) {
                	//has default clause
                	sem.expr1 = params[2].expr1;
                }
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[2].vec != null) {
                	params[0].vec.addAll(params[2].vec);	
                }
                return;
            }
            case 30: {
                //# line 761
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 31: {
                /* no action */
                return;
            }
            case 32: {
                //# line 625
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 33: {
                //# line 822
                params[0].expr = params[1].expr;
                return;
            }
            case 34: {
                //# line 826
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 35: {
                //# line 830
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 36: {
                //# line 834
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 37: {
                //# line 838
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 38: {
                //# line 846
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 39: {
                //# line 850
                params[0].expr = params[2].expr;
                return;
            }
            case 40: {
                //# line 854
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 41: {
                //# line 862
                params[0].expr = new Tree.ArrayComp(params[2].expr, params[4].ident, params[6].expr, params[7].expr, params[1].loc);
                return;
            }
            case 42: {
                //# line 1003
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 43: {
                //# line 516
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 44: {
                /* no action */
                return;
            }
            case 45: {
                //# line 197
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 46: {
                /* no action */
                return;
            }
            case 47: {
                //# line 916
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 48: {
                //# line 920
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 49: {
                //# line 924
                params[0].expr = params[1].expr;
                return;
            }
            case 50: {
                //# line 180
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 51: {
                /* no action */
                return;
            }
            case 52: {
                //# line 1035
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 53: {
                //# line 936
                params[2].elist.add(params[1].expr);
                params[0].elist = params[2].elist;
                return;
            }
            case 54: {
                //# line 941
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 55: {
                //# line 997
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 56: {
                //# line 712
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 57: {
                //# line 716
                params[0].expr = params[1].expr;
                return;
            }
            case 58: {
                //# line 475
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 59: {
                //# line 256
                params[0].stmt = new Tree.ForeachLoop(params[3].stmt, params[5].expr, params[6].expr, params[8].stmt, params[1].loc);
                return;
            }
            case 60: {
                //# line 930
                params[0].expr = new Tree.Literal(Tree.ARRAYCONST, params[2].elist, params[1].loc);
                return;
            }
            case 61: {
                //# line 791
                params[0].loc = params[1].loc;
                params[0].vec = params[4].vec;
                params[0].expr = params[2].expr;
                return;
            }
            case 62: {
                //# line 797
                params[0].vec = params[2].vec;
                params[0].expr1 = params[2].expr1;
                return;
            }
            case 63: {
                //# line 298
                params[0].stmt = new Tree.Guard(params[2].elist, params[2].slist, params[1].loc);
                return;
            }
            case 64: {
                //# line 948
                params[3].elist.add(params[2].expr);
                params[0].elist = params[3].elist;
                return;
            }
            case 65: {
                //# line 953
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 66: {
                //# line 365
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 67: {
                //# line 1015
                params[0].stmt = params[2].stmt;
                return;
            }
            case 68: {
                /* no action */
                return;
            }
            case 69: {
                //# line 120
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 70: {
                //# line 130
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 71: {
                //# line 319
                params[3].elist.add(params[2].expr);
                params[3].slist.add(params[2].stmt);
                params[0].elist = params[3].elist;
                params[0].slist = params[3].slist;
                return;
            }
            case 72: {
                //# line 326
                params[0] = new SemValue();
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].slist = new ArrayList<Tree>();
                return;
            }
            case 73: {
                //# line 978
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 74: {
                //# line 984
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 75: {
                //# line 722
                               params[0].expr = params[1].expr;
                               params[0].loc = params[1].loc;
                               if (params[2].vec != null) {
                                   for (SemValue v : params[2].vec) {
                                       if (v.expr != null) {
                if (v.expr1 != null) {
                	//default index
                	params[0].expr = new Tree.Ternary(Tree.DYNACCESS, params[0].expr, v.expr, v.expr1, params[0].loc);
                	continue;
                }
                                           params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                                       } else if (v.elist != null) {
                                           params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                                           params[0].loc = v.loc;
                                       } else {
                                           params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                                           params[0].loc = v.loc;
                                       }
                                   }
                               }
                return;
            }
            case 76: {
                //# line 904
                params[0].expr = params[1].expr;
                return;
            }
            case 77: {
                //# line 908
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 78: {
                //# line 103
                params[0].cdef = new Tree.ClassDef(false, params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 79: {
                //# line 107
                params[0].cdef = new Tree.ClassDef(true, params[3].ident, params[4].ident, params[6].flist, params[2].loc);
                return;
            }
            case 80: {
                //# line 1022
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 81: {
                //# line 970
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 82: {
                //# line 191
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 83: {
                //# line 152
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 84: {
                /* no action */
                return;
            }
            case 85: {
                //# line 815
                params[0].elist = params[2].elist;
                return;
            }
            case 86: {
                /* no action */
                return;
            }
            case 87: {
                //# line 456
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 88: {
                //# line 461
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 89: {
                //# line 28
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 90: {
                //# line 469
                params[0].expr = params[1].expr;
                return;
            }
            case 91: {
                //# line 84
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 92: {
                //# line 596
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 93: {
                //# line 878
                params[0].ident = params[1].ident;
                return;
            }
            case 94: {
                //# line 882
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 95: {
                //# line 356
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 96: {
                /* no action */
                return;
            }
            case 97: {
                //# line 113
                params[0].ident = params[2].ident;
                return;
            }
            case 98: {
                /* no action */
                return;
            }
            case 99: {
                //# line 398
                params[0].counter = Tree.AINIT;
                params[0].loc = params[1].loc;
                return;
            }
            case 100: {
                //# line 93
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 101: {
                //# line 97
                params[0].counter = 0;
                return;
            }
            case 102: {
                //# line 262
                params[0].expr = params[2].expr;
                return;
            }
            case 103: {
                //# line 266
                params[0] = new SemValue();
                return;
            }
            case 104: {
                //# line 304
                params[2].elist.add(params[1].expr);
                params[2].slist.add(params[1].stmt);
                params[0].elist = params[2].elist;
                params[0].slist = params[2].slist;
                return;
            }
            case 105: {
                //# line 311
                params[0] = new SemValue();
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].slist = new ArrayList<Tree>();
                return;
            }
            case 106: {
                //# line 533
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 107: {
                //# line 960
                params[0].elist = params[1].elist;
                return;
            }
            case 108: {
                //# line 964
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 109: {
                //# line 56
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 110: {
                //# line 545
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 111: {
                /* no action */
                return;
            }
            case 112: {
                //# line 205
                params[0].stmt = params[1].vdef;
                return;
            }
            case 113: {
                //# line 209
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 114: {
                //# line 217
                params[0].stmt = params[1].stmt;
                return;
            }
            case 115: {
                //# line 221
                params[0].stmt = params[1].stmt;
                return;
            }
            case 116: {
                //# line 225
                params[0].stmt = params[1].stmt;
                return;
            }
            case 117: {
                //# line 229
                params[0].stmt = params[1].stmt;
                return;
            }
            case 118: {
                //# line 233
                params[0].stmt = params[1].stmt;
                return;
            }
            case 119: {
                //# line 237
                params[0].stmt = params[1].stmt;
                return;
            }
            case 120: {
                //# line 241
                params[0].stmt = params[1].stmt;	
                return;
            }
            case 121: {
                //# line 245
                params[0].loc = params[1].loc;
                params[0].stmt = params[2].stmt;	
                return;
            }
            case 122: {
                //# line 250
                params[0].stmt = params[1].stmt;	
                return;
            }
            case 123: {
                //# line 776
                if (params[2].expr != null) {
                	params[0].expr = new Tree.Binary(Tree.RANGE, params[1].expr, params[2].expr, params[2].loc);
                } else if (params[2].expr1 != null) {
                	//default next
                	params[0].expr = params[1].expr;
                	params[0].expr1 = params[2].expr1;
                } else {
                	params[0].expr = params[1].expr;	
                }
                params[0].vec = params[2].vec;
                return;
            }
            case 124: {
                //# line 341
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 125: {
                //# line 349
                params[0].stmt = new Tree.Assign(new Tree.Var(params[2].ident, params[2].loc), params[4].expr, params[3].loc);
                return;
            }
            case 126: {
                /* no action */
                return;
            }
            case 127: {
                //# line 804
                params[0].vec = params[1].vec;	
                return;
            }
            case 128: {
                //# line 808
                params[0].expr1 = params[2].expr;
                params[0].vec = params[3].vec;
                return;
            }
            case 129: {
                //# line 666
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 130: {
                /* no action */
                return;
            }
            case 131: {
                //# line 62
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 132: {
                //# line 66
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 133: {
                //# line 70
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 134: {
                //# line 74
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 135: {
                //# line 78
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 136: {
                //# line 991
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 137: {
                //# line 487
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 138: {
                /* no action */
                return;
            }
            case 139: {
                //# line 562
                                 if (params[2].svec != null) {
                int size = params[2].evec.size();
                params[0].expr = params[2].evec.get(size-1);
                                     for (int i = size-2; i >= 0; --i) {
                                         params[0].expr = new Tree.Binary(params[2].svec.get(i+1), params[2].evec.get(i),
                                             params[0].expr, params[2].lvec.get(i));
                                     }
                params[0].expr = new Tree.Binary(params[2].svec.get(0), params[1].expr,
                                             params[0].expr, params[1].loc);
                                 } else {
                	params[0].expr = params[1].expr;
                }
                return;
            }
            case 140: {
                //# line 579
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 141: {
                /* no action */
                return;
            }
            case 142: {
                //# line 1028
                params[0].expr = params[1].expr;
                return;
            }
            case 143: {
                /* no action */
                return;
            }
            case 144: {
                //# line 1009
                params[0].stmt = new Tree.If(params[2].expr, params[4].stmt, params[5].stmt, params[1].loc);
                return;
            }
            case 145: {
                //# line 282
                params[0].stmt = new Tree.Scopy(params[3].ident, params[5].expr, params[1].loc);
                return;
            }
            case 146: {
                //# line 637
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 147: {
                /* no action */
                return;
            }
            case 148: {
                //# line 695
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 149: {
                /* no action */
                return;
            }
            case 150: {
                //# line 654
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 151: {
                //# line 39
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 152: {
                /* no action */
                return;
            }
            case 153: {
                //# line 391
                params[0].counter = Tree.CONCAT;
                params[0].loc = params[1].loc;
                return;
            }
            case 154: {
                //# line 136
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 155: {
                //# line 141
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
