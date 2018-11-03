/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: D:\decaf_PA1_B\src\decaf\frontend\Parser.spec
 * Options: unstrict mode
 * Generated at: Sun Nov 04 03:32:38 CST 2018
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
    
    public static final int VariableDef = 294;
    public static final int ExprT5 = 295;
    public static final int Oper8 = 296;
    public static final int Oper3 = 297;
    public static final int Oper6 = 298;
    public static final int VariableList = 299;
    public static final int Formals = 300;
    public static final int Oper7 = 301;
    public static final int IfSubStmt = 302;
    public static final int Expr8 = 303;
    public static final int AfterSimpleTypeExpr = 304;
    public static final int AfterIf = 305;
    public static final int Expr2 = 306;
    public static final int Oper2 = 307;
    public static final int ExprT10 = 308;
    public static final int Expr6 = 309;
    public static final int Expr11 = 310;
    public static final int BreakStmt = 311;
    public static final int ExprT2 = 312;
    public static final int StmtList = 313;
    public static final int Constant = 314;
    public static final int SubVariableList = 315;
    public static final int PrintStmt = 316;
    public static final int ConstantList = 317;
    public static final int ForStmt = 318;
    public static final int Expr9 = 319;
    public static final int Expr1 = 320;
    public static final int ArrayConstant = 321;
    public static final int GuardedStmt = 322;
    public static final int ConstantListT = 323;
    public static final int Oper1 = 324;
    public static final int ElseClause = 325;
    public static final int FieldList = 326;
    public static final int IfBranch = 327;
    public static final int SubExprList = 328;
    public static final int Expr10 = 329;
    public static final int AfterParenExpr = 330;
    public static final int ClassDef = 331;
    public static final int ReturnStmt = 332;
    public static final int ExprList = 333;
    public static final int StmtBlock = 334;
    public static final int FunctionField = 335;
    public static final int AfterIdentExpr = 336;
    public static final int RangeExpr = 337;
    public static final int Oper9 = 338;
    public static final int Program = 339;
    public static final int Expr = 340;
    public static final int Type = 341;
    public static final int Expr5 = 342;
    public static final int AfterNewExpr = 343;
    public static final int Assignment = 344;
    public static final int ExtendsClause = 345;
    public static final int Oper5 = 346;
    public static final int ArrayType = 347;
    public static final int GuardMiddleExpr = 348;
    public static final int Expr3 = 349;
    public static final int Actuals = 350;
    public static final int Variable = 351;
    public static final int HalfExpr = 352;
    public static final int ExprT3 = 353;
    public static final int Stmt = 354;
    public static final int SimpleStmt = 355;
    public static final int ExprT7 = 356;
    public static final int SimpleType = 357;
    public static final int WhileStmt = 358;
    public static final int ExprT1 = 359;
    public static final int Expr4 = 360;
    public static final int ExprT4 = 361;
    public static final int ReturnExpr = 362;
    public static final int IfStmt = 363;
    public static final int OCStmt = 364;
    public static final int ExprT6 = 365;
    public static final int ExprT8 = 366;
    public static final int Expr7 = 367;
    public static final int ClassList = 368;
    public static final int Oper4 = 369;
    public static final int Field = 370;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 294;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "SCOPY", "SEALED",
        "GUARDOR", "VAR", "ARRAYINIT", "ARRAYCONCAT", "IN",
        "DEFAULT", "FOREACH", "VariableDef", "ExprT5", "Oper8",
        "Oper3", "Oper6", "VariableList", "Formals", "Oper7",
        "IfSubStmt", "Expr8", "AfterSimpleTypeExpr", "AfterIf", "Expr2",
        "Oper2", "ExprT10", "Expr6", "Expr11", "BreakStmt",
        "ExprT2", "StmtList", "Constant", "SubVariableList", "PrintStmt",
        "ConstantList", "ForStmt", "Expr9", "Expr1", "ArrayConstant",
        "GuardedStmt", "ConstantListT", "Oper1", "ElseClause", "FieldList",
        "IfBranch", "SubExprList", "Expr10", "AfterParenExpr", "ClassDef",
        "ReturnStmt", "ExprList", "StmtBlock", "FunctionField", "AfterIdentExpr",
        "RangeExpr", "Oper9", "Program", "Expr", "Type",
        "Expr5", "AfterNewExpr", "Assignment", "ExtendsClause", "Oper5",
        "ArrayType", "GuardMiddleExpr", "Expr3", "Actuals", "Variable",
        "HalfExpr", "ExprT3", "Stmt", "SimpleStmt", "ExprT7",
        "SimpleType", "WhileStmt", "ExprT1", "Expr4", "ExprT4",
        "ReturnExpr", "IfStmt", "OCStmt", "ExprT6", "ExprT8",
        "Expr7", "ClassList", "Oper4", "Field",
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
        {ARRAYINIT, Integer.valueOf(']'), ARRAYCONCAT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {EQUAL, NOT_EQUAL},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{'), Integer.valueOf('(')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {AND},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER},
        {BREAK},
        {AND, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {LITERAL, NULL, Integer.valueOf('['), Integer.valueOf(']')},
        {FOR},
        {Integer.valueOf('-'), Integer.valueOf('!'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('[')},
        {Integer.valueOf('{')},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {GUARDOR, Integer.valueOf('}')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, CLASS},
        {CLASS, SEALED},
        {RETURN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {CLASS, SEALED},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {ARRAYINIT},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf('}')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(')')},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf(':'), Integer.valueOf(']')},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), READ_INTEGER, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{'), SCOPY, IF},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, VAR, Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {INT, VOID, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {ARRAYCONCAT, Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(';')},
        {Integer.valueOf('(')},
        {SCOPY},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), ARRAYCONCAT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), ARRAYINIT},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
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
        return begin.get(symbol - 294);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), ARRAYCONCAT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {GUARDOR, Integer.valueOf('}')},
        {LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(']'), ARRAYCONCAT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {CLASS, SEALED, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(']')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {eof, eos},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {IDENTIFIER},
        {Integer.valueOf(']'), ARRAYCONCAT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf('}')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, GUARDOR, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), ARRAYCONCAT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), ARRAYINIT},
        {LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {LESS_EQUAL, Integer.valueOf(']'), ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 294);
    }
    
    public Table() {
        for (int i = 0; i < 77; i++) {
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
            //# line 577
            case ExprT5: {
                switch (lookahead) {
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case ']':
                    case ARRAYCONCAT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 408
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
            //# line 348
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 374
            case Oper6: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(8, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(Integer.valueOf('>')));
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
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList(Variable, SubVariableList));
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
                        return new AbstractMap.SimpleEntry<>(13, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList());
                    default: return null;
                }
            }
            //# line 396
            case Oper7: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 303
            case IfSubStmt: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 652
            case Expr8: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 817
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 257
            case AfterIf: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(21, Arrays.asList(GuardedStmt));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(IfStmt));
                    default: return null;
                }
            }
            //# line 473
            case Expr2: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(23, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 341
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 711
            case ExprT10: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList(Integer.valueOf('['), RangeExpr, Integer.valueOf(']'), ExprT10));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(26, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT10));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 594
            case Expr6: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(28, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 761
            case Expr11: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(29, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(30, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(31, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(32, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(33, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(35, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    default: return null;
                }
            }
            //# line 928
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(37, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 485
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(38, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
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
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 841
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(42, Arrays.asList(LITERAL));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(43, Arrays.asList(NULL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(44, Arrays.asList(ArrayConstant));
                    default: return null;
                }
            }
            //# line 179
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 960
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 861
            case ConstantList: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(48, Arrays.asList(Constant, ConstantListT));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList());
                    default: return null;
                }
            }
            //# line 922
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 681
            case Expr9: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(51, Arrays.asList(Oper9, Expr10));
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
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(Expr10));
                    default: return null;
                }
            }
            //# line 444
            case Expr1: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 855
            case ArrayConstant: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList(Integer.valueOf('['), ConstantList, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 267
            case GuardedStmt: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(Integer.valueOf('{'), GuardMiddleExpr, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 873
            case ConstantListT: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(56, Arrays.asList(Integer.valueOf(','), Constant, ConstantListT));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList());
                    default: return null;
                }
            }
            //# line 334
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(58, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 940
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(59, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
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
                        return new AbstractMap.SimpleEntry<>(61, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList());
                    default: return null;
                }
            }
            //# line 288
            case IfBranch: {
                switch (lookahead) {
                    case GUARDOR:
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList(GUARDOR, IfSubStmt, IfBranch));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(64, Arrays.asList());
                    default: return null;
                }
            }
            //# line 903
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(65, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(66, Arrays.asList());
                    default: return null;
                }
            }
            //# line 691
            case Expr10: {
                switch (lookahead) {
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
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList(Expr11, ExprT10));
                    default: return null;
                }
            }
            //# line 829
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(68, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr11));
                    default: return null;
                }
            }
            //# line 102
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList(SEALED, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 947
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 895
            case ExprList: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(73, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 190
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(74, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 151
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(75, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 754
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(77, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 736
            case RangeExpr: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(Expr, HalfExpr));
                    default: return null;
                }
            }
            //# line 425
            case Oper9: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(80, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 27
            case Program: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(82, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 438
            case Expr: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(83, Arrays.asList(Expr1));
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
                        return new AbstractMap.SimpleEntry<>(84, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 565
            case Expr5: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(85, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 803
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(86, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(87, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 325
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(88, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 112
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(90, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 367
            case Oper5: {
                switch (lookahead) {
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(92, Arrays.asList(ARRAYINIT));
                    default: return null;
                }
            }
            //# line 92
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(93, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList());
                    default: return null;
                }
            }
            //# line 273
            case GuardMiddleExpr: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(95, Arrays.asList(IfSubStmt, IfBranch));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(96, Arrays.asList());
                    default: return null;
                }
            }
            //# line 502
            case Expr3: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(97, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 885
            case Actuals: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(98, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList());
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
                        return new AbstractMap.SimpleEntry<>(100, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 746
            case HalfExpr: {
                switch (lookahead) {
                    case ':':
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList(Integer.valueOf(':'), Expr));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 514
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(103, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
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
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList(VariableDef));
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(106, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(107, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(109, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(110, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(111, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(112, Arrays.asList(StmtBlock));
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(OCStmt));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(114, Arrays.asList(IF, AfterIf));
                    default: return null;
                }
            }
            //# line 310
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(Expr, Assignment));
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(116, Arrays.asList(VAR, IDENTIFIER, Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 635
            case ExprT7: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(118, Arrays.asList(Oper7, Expr8, ExprT7));
                    case LESS_EQUAL:
                    case ']':
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 61
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(120, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(121, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(122, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(123, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(124, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 916
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(125, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 456
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(126, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case ';':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 531
            case Expr4: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(128, Arrays.asList(Expr5, ExprT4));
                    default: return null;
                }
            }
            //# line 548
            case ExprT4: {
                switch (lookahead) {
                    case ARRAYCONCAT:
                        return new AbstractMap.SimpleEntry<>(129, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 953
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 934
            case IfStmt: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(133, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 251
            case OCStmt: {
                switch (lookahead) {
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(134, Arrays.asList(SCOPY, Integer.valueOf('('), IDENTIFIER, Integer.valueOf(','), Expr, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 606
            case ExprT6: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(135, Arrays.asList(Oper6, Expr7, ExprT6));
                    case ']':
                    case ARRAYCONCAT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 664
            case ExprT8: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(137, Arrays.asList(Oper8, Expr9, ExprT8));
                    case LESS_EQUAL:
                    case ']':
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 623
            case Expr7: {
                switch (lookahead) {
                    case '!':
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
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList(Expr8, ExprT7));
                    default: return null;
                }
            }
            //# line 38
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(140, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList());
                    default: return null;
                }
            }
            //# line 360
            case Oper4: {
                switch (lookahead) {
                    case ARRAYCONCAT:
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(ARRAYCONCAT));
                    default: return null;
                }
            }
            //# line 135
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(143, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(144, Arrays.asList(Type, IDENTIFIER, FunctionField));
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
                //# line 578
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
                //# line 409
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 4: {
                //# line 414
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 5: {
                //# line 419
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 6: {
                //# line 349
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 354
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 375
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 380
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 385
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 390
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 12: {
                //# line 170
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 13: {
                //# line 160
                params[0].vlist = params[1].vlist;
                return;
            }
            case 14: {
                //# line 164
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 15: {
                //# line 397
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 16: {
                //# line 402
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 17: {
                //# line 304
                params[0].expr = params[1].expr;
                params[0].stmt = params[3].stmt;
                return;
            }
            case 18: {
                //# line 653
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 19: {
                //# line 818
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 20: {
                //# line 823
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 21: {
                //# line 258
                params[0].stmt = params[1].stmt;	
                return;
            }
            case 22: {
                //# line 262
                params[0].stmt = params[1].stmt;
                return;
            }
            case 23: {
                //# line 474
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 24: {
                //# line 342
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 25: {
                //# line 712
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 26: {
                //# line 722
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
            case 27: {
                /* no action */
                return;
            }
            case 28: {
                //# line 595
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 29: {
                //# line 762
                params[0].expr = params[1].expr;
                return;
            }
            case 30: {
                //# line 766
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 31: {
                //# line 770
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 32: {
                //# line 774
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 33: {
                //# line 778
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 34: {
                //# line 786
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 35: {
                //# line 790
                params[0].expr = params[2].expr;
                return;
            }
            case 36: {
                //# line 794
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 37: {
                //# line 929
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 38: {
                //# line 486
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
            case 39: {
                /* no action */
                return;
            }
            case 40: {
                //# line 197
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 41: {
                /* no action */
                return;
            }
            case 42: {
                //# line 842
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 43: {
                //# line 846
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 44: {
                //# line 850
                params[0].expr = params[1].expr;
                return;
            }
            case 45: {
                //# line 180
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 46: {
                /* no action */
                return;
            }
            case 47: {
                //# line 961
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 48: {
                //# line 862
                params[2].elist.add(params[1].expr);
                params[0].elist = params[2].elist;
                return;
            }
            case 49: {
                //# line 867
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 50: {
                //# line 923
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 51: {
                //# line 682
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 52: {
                //# line 686
                params[0].expr = params[1].expr;
                return;
            }
            case 53: {
                //# line 445
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 54: {
                //# line 856
                params[0].expr = new Tree.Literal(Tree.ARRAYCONST, params[2].elist, params[1].loc);
                return;
            }
            case 55: {
                //# line 268
                params[0].stmt = new Tree.Guard(params[2].elist, params[2].slist, params[1].loc);
                return;
            }
            case 56: {
                //# line 874
                params[3].elist.add(params[2].expr);
                params[0].elist = params[3].elist;
                return;
            }
            case 57: {
                //# line 879
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 58: {
                //# line 335
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 59: {
                //# line 941
                params[0].stmt = params[2].stmt;
                return;
            }
            case 60: {
                /* no action */
                return;
            }
            case 61: {
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
            case 62: {
                //# line 130
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 63: {
                //# line 289
                params[3].elist.add(params[2].expr);
                params[3].slist.add(params[2].stmt);
                params[0].elist = params[3].elist;
                params[0].slist = params[3].slist;
                return;
            }
            case 64: {
                //# line 296
                params[0] = new SemValue();
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].slist = new ArrayList<Tree>();
                return;
            }
            case 65: {
                //# line 904
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 66: {
                //# line 910
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 67: {
                //# line 692
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
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
            case 68: {
                //# line 830
                params[0].expr = params[1].expr;
                return;
            }
            case 69: {
                //# line 834
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 70: {
                //# line 103
                params[0].cdef = new Tree.ClassDef(false, params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 71: {
                //# line 107
                params[0].cdef = new Tree.ClassDef(true, params[3].ident, params[4].ident, params[6].flist, params[2].loc);
                return;
            }
            case 72: {
                //# line 948
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 73: {
                //# line 896
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 74: {
                //# line 191
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 75: {
                //# line 152
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 76: {
                /* no action */
                return;
            }
            case 77: {
                //# line 755
                params[0].elist = params[2].elist;
                return;
            }
            case 78: {
                /* no action */
                return;
            }
            case 79: {
                //# line 737
                if (params[2].expr == null) {
                	params[0].expr = params[1].expr;		
                } else {
                	params[0].expr = new Tree.Binary(Tree.RANGE, params[1].expr, params[2].expr, params[2].loc);	
                }
                return;
            }
            case 80: {
                //# line 426
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 81: {
                //# line 431
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 82: {
                //# line 28
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 83: {
                //# line 439
                params[0].expr = params[1].expr;
                return;
            }
            case 84: {
                //# line 84
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 85: {
                //# line 566
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 86: {
                //# line 804
                params[0].ident = params[1].ident;
                return;
            }
            case 87: {
                //# line 808
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 88: {
                //# line 326
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 89: {
                /* no action */
                return;
            }
            case 90: {
                //# line 113
                params[0].ident = params[2].ident;
                return;
            }
            case 91: {
                /* no action */
                return;
            }
            case 92: {
                //# line 368
                params[0].counter = Tree.AINIT;
                params[0].loc = params[1].loc;
                return;
            }
            case 93: {
                //# line 93
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 94: {
                //# line 97
                params[0].counter = 0;
                return;
            }
            case 95: {
                //# line 274
                params[2].elist.add(params[1].expr);
                params[2].slist.add(params[1].stmt);
                params[0].elist = params[2].elist;
                params[0].slist = params[2].slist;
                return;
            }
            case 96: {
                //# line 281
                params[0] = new SemValue();
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].slist = new ArrayList<Tree>();
                return;
            }
            case 97: {
                //# line 503
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 98: {
                //# line 886
                params[0].elist = params[1].elist;
                return;
            }
            case 99: {
                //# line 890
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 100: {
                //# line 56
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 101: {
                //# line 747
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;	
                return;
            }
            case 102: {
                /* no action */
                return;
            }
            case 103: {
                //# line 515
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
            case 104: {
                /* no action */
                return;
            }
            case 105: {
                //# line 205
                params[0].stmt = params[1].vdef;
                return;
            }
            case 106: {
                //# line 209
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 107: {
                //# line 217
                params[0].stmt = params[1].stmt;
                return;
            }
            case 108: {
                //# line 221
                params[0].stmt = params[1].stmt;
                return;
            }
            case 109: {
                //# line 225
                params[0].stmt = params[1].stmt;
                return;
            }
            case 110: {
                //# line 229
                params[0].stmt = params[1].stmt;
                return;
            }
            case 111: {
                //# line 233
                params[0].stmt = params[1].stmt;
                return;
            }
            case 112: {
                //# line 237
                params[0].stmt = params[1].stmt;
                return;
            }
            case 113: {
                //# line 241
                params[0].stmt = params[1].stmt;	
                return;
            }
            case 114: {
                //# line 245
                params[0].loc = params[1].loc;
                params[0].stmt = params[2].stmt;	
                return;
            }
            case 115: {
                //# line 311
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 116: {
                //# line 319
                params[0].stmt = new Tree.Assign(new Tree.Var(params[2].ident, params[2].loc), params[4].expr, params[3].loc);
                return;
            }
            case 117: {
                /* no action */
                return;
            }
            case 118: {
                //# line 636
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
            case 119: {
                /* no action */
                return;
            }
            case 120: {
                //# line 62
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 121: {
                //# line 66
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 122: {
                //# line 70
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 123: {
                //# line 74
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 124: {
                //# line 78
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 125: {
                //# line 917
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 126: {
                //# line 457
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
            case 127: {
                /* no action */
                return;
            }
            case 128: {
                //# line 532
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
            case 129: {
                //# line 549
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
                //# line 954
                params[0].expr = params[1].expr;
                return;
            }
            case 132: {
                /* no action */
                return;
            }
            case 133: {
                //# line 935
                params[0].stmt = new Tree.If(params[2].expr, params[4].stmt, params[5].stmt, params[1].loc);
                return;
            }
            case 134: {
                //# line 252
                params[0].stmt = new Tree.Scopy(params[3].ident, params[5].expr, params[1].loc);
                return;
            }
            case 135: {
                //# line 607
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
            case 136: {
                /* no action */
                return;
            }
            case 137: {
                //# line 665
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
                //# line 624
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 140: {
                //# line 39
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 141: {
                /* no action */
                return;
            }
            case 142: {
                //# line 361
                params[0].counter = Tree.CONCAT;
                params[0].loc = params[1].loc;
                return;
            }
            case 143: {
                //# line 136
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 144: {
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
