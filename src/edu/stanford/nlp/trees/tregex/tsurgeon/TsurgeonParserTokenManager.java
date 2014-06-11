/* TsurgeonParserTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. TsurgeonParserTokenManager.java */
package edu.stanford.nlp.trees.tregex.tsurgeon;
import java.io.StringReader;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.util.Generics;
import edu.stanford.nlp.util.Pair;
import java.util.*;

/** Token Manager. */
@SuppressWarnings("unused")class TsurgeonParserTokenManager implements TsurgeonParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0xfff0L) != 0L)
         {
            jjmatchedKind = 18;
            return 55;
         }
         if ((active0 & 0x8L) != 0L)
            return 14;
         return -1;
      case 1:
         if ((active0 & 0xfff0L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 1;
            return 55;
         }
         return -1;
      case 2:
         if ((active0 & 0xfff0L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
            return 55;
         }
         return -1;
      case 3:
         if ((active0 & 0x200L) != 0L)
            return 55;
         if ((active0 & 0xfdf0L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
            return 55;
         }
         return -1;
      case 4:
         if ((active0 & 0x20L) != 0L)
            return 55;
         if ((active0 & 0xfdd0L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 4;
            return 55;
         }
         return -1;
      case 5:
         if ((active0 & 0x8c40L) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 18;
               jjmatchedPos = 5;
            }
            return 55;
         }
         if ((active0 & 0x7190L) != 0L)
            return 55;
         return -1;
      case 6:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 6;
            return 55;
         }
         if ((active0 & 0xe440L) != 0L)
            return 55;
         return -1;
      case 7:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 7;
            return 55;
         }
         return -1;
      case 8:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 8;
            return 55;
         }
         return -1;
      case 9:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 9;
            return 55;
         }
         return -1;
      case 10:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 10;
            return 55;
         }
         return -1;
      case 11:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 11;
            return 55;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         return jjStartNfaWithStates_0(0, 3, 14);
      case 10:
         return jjStopAtPos(0, 26);
      case 41:
         return jjStopAtPos(0, 29);
      case 91:
         return jjStopAtPos(0, 27);
      case 93:
         return jjStopAtPos(0, 28);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x7000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x8800L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x440L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x7000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x450L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x8200L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x820L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 106:
         return jjMoveStringLiteralDfa3_0(active0, 0x7000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x50L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x840L);
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 55);
         return jjMoveStringLiteralDfa4_0(active0, 0x110L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x8020L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x7000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 98:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 101:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 55);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x7000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x810L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 101:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(5, 4, 55);
         else if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 55);
         return jjMoveStringLiteralDfa6_0(active0, 0x8840L);
      case 110:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x6000L);
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(5, 8, 55);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 70:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(6, 14, 55);
         break;
      case 72:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 55);
         break;
      case 83:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 55);
         break;
      case 108:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(6, 6, 55);
         break;
      case 120:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 55);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa9_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa11_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa12_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(12, 11, 55);
         break;
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 55;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfbfffcfeffffdbffL & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                     { jjCheckNAdd(14); }
                  }
                  else if (curChar == 40)
                  {
                     if (kind > 25)
                        kind = 25;
                     { jjCheckNAdd(16); }
                  }
                  if ((0x240000000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     { jjCheckNAdd(1); }
                  }
                  else if (curChar == 47)
                     { jjCheckNAddStates(0, 5); }
                  else if (curChar == 35)
                     { jjAddStates(6, 7); }
                  else if (curChar == 36)
                     { jjAddStates(8, 9); }
                  else if (curChar == 62)
                     { jjCheckNAddTwoStates(5, 6); }
                  if (curChar == 35)
                     { jjCheckNAdd(13); }
                  break;
               case 55:
                  if ((0xfbfffcfeffffdbffL & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                     { jjCheckNAdd(14); }
                  }
                  if ((0x23ff240000000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     { jjCheckNAdd(1); }
                  }
                  break;
               case 1:
                  if ((0x23ff240000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAdd(1); }
                  break;
               case 3:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 4:
                  if (curChar == 62)
                     { jjCheckNAddTwoStates(5, 6); }
                  break;
               case 5:
                  if (curChar == 45)
                     { jjCheckNAdd(6); }
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  { jjCheckNAdd(6); }
                  break;
               case 10:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjAddStates(10, 12); }
                  break;
               case 12:
                  if (curChar == 35)
                     { jjCheckNAdd(13); }
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(13); }
                  break;
               case 14:
                  if ((0xfbfffcfeffffdbffL & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  { jjCheckNAdd(14); }
                  break;
               case 15:
                  if (curChar != 40)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAdd(16); }
                  break;
               case 16:
                  if ((0xf3fffcfa00000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAdd(16); }
                  break;
               case 17:
                  if (curChar == 36)
                     { jjAddStates(8, 9); }
                  break;
               case 18:
                  if (curChar == 45 && kind > 20)
                     kind = 20;
                  break;
               case 19:
                  if (curChar == 43 && kind > 20)
                     kind = 20;
                  break;
               case 20:
                  if (curChar == 35)
                     { jjAddStates(6, 7); }
                  break;
               case 37:
                  if (curChar == 47)
                     { jjCheckNAddStates(0, 5); }
                  break;
               case 38:
                  if (curChar == 47)
                     { jjCheckNAddStates(13, 15); }
                  break;
               case 40:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(13, 15); }
                  break;
               case 41:
                  if (curChar == 47)
                     { jjCheckNAddStates(16, 18); }
                  break;
               case 42:
                  if (curChar == 61)
                     { jjCheckNAdd(43); }
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddStates(19, 22); }
                  break;
               case 44:
                  if (curChar == 37)
                     { jjCheckNAdd(45); }
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddStates(23, 26); }
                  break;
               case 46:
               case 47:
                  if (curChar == 47)
                     { jjCheckNAddStates(27, 29); }
                  break;
               case 49:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(27, 29); }
                  break;
               case 50:
                  if (curChar != 47)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddStates(16, 18); }
                  break;
               case 51:
                  if (curChar == 47)
                     { jjCheckNAddStates(30, 32); }
                  break;
               case 53:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(30, 32); }
                  break;
               case 54:
                  if (curChar == 47 && kind > 21)
                     kind = 21;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffd7ffffffL & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                     { jjCheckNAdd(14); }
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     { jjCheckNAdd(1); }
                  }
                  else if (curChar == 124)
                     { jjCheckNAddStates(10, 12); }
                  if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 19)
                        kind = 19;
                     { jjCheckNAdd(3); }
                  }
                  break;
               case 55:
                  if ((0xffffffffd7ffffffL & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                     { jjCheckNAdd(14); }
                  }
                  if ((0x17fffffe87ffffffL & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     { jjCheckNAdd(1); }
                  }
                  break;
               case 1:
                  if ((0x17fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAdd(1); }
                  break;
               case 2:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  { jjCheckNAdd(3); }
                  break;
               case 3:
                  if ((0x87fffffeL & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  { jjCheckNAdd(3); }
                  break;
               case 7:
               case 8:
                  if (curChar == 124)
                     { jjCheckNAddStates(10, 12); }
                  break;
               case 9:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if ((0xefffffffffffffffL & l) != 0L)
                     { jjCheckNAddStates(10, 12); }
                  break;
               case 11:
                  if (curChar == 124 && kind > 22)
                     kind = 22;
                  break;
               case 14:
                  if ((0xffffffffd7ffffffL & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  { jjCheckNAdd(14); }
                  break;
               case 16:
                  if ((0x7fffffffffffffffL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 21:
                  if (curChar == 116 && kind > 16)
                     kind = 16;
                  break;
               case 22:
               case 30:
                  if (curChar == 115)
                     { jjCheckNAdd(21); }
                  break;
               case 23:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 31:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 35:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 39:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  { jjAddStates(13, 15); }
                  break;
               case 43:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddStates(19, 22); }
                  break;
               case 45:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAddStates(23, 26); }
                  break;
               case 48:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  { jjAddStates(27, 29); }
                  break;
               case 52:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 53:
                  { jjAddStates(30, 32); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 14:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 24)
                     kind = 24;
                  { jjCheckNAdd(14); }
                  break;
               case 55:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 24)
                     kind = 24;
                  { jjCheckNAdd(14); }
                  break;
               case 10:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(10, 12); }
                  break;
               case 40:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(13, 15); }
                  break;
               case 49:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(27, 29); }
                  break;
               case 53:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(30, 32); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 || l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 55 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   39, 40, 41, 52, 53, 54, 29, 36, 18, 19, 9, 10, 11, 39, 40, 41, 
   42, 44, 46, 42, 43, 44, 46, 42, 44, 45, 46, 48, 49, 50, 52, 53, 
   54, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\144\145\154\145\164\145", "\160\162\165\156\145", 
"\162\145\154\141\142\145\154", "\145\170\143\151\163\145", "\151\156\163\145\162\164", "\155\157\166\145", 
"\162\145\160\154\141\143\145", "\143\162\145\141\164\145\123\165\142\164\162\145\145", 
"\141\144\152\157\151\156", "\141\144\152\157\151\156\110", "\141\144\152\157\151\156\106", 
"\143\157\151\156\144\145\170", null, null, null, null, null, null, null, null, null, null, "\12", "\133", 
"\135", "\51", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002000L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public TsurgeonParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public TsurgeonParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 55; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3ffffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[55];
    private final int[] jjstateSet = new int[2 * 55];

    
    protected char curChar;
}
