/* GramaticaTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. GramaticaTokenManager.java */
import java.util.*;
import java.io.*;

/** Token Manager. */
@SuppressWarnings("unused")public class GramaticaTokenManager implements GramaticaConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400000L) != 0L)
            return 10;
         if ((active0 & 0xffc03ff00L) != 0L)
         {
            jjmatchedKind = 56;
            return 1;
         }
         if ((active0 & 0x14000000000L) != 0L)
            return 7;
         return -1;
      case 1:
         if ((active0 & 0x30010000L) != 0L)
            return 1;
         if ((active0 & 0xfcc02ff00L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 1;
            }
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x4000400L) != 0L)
            return 1;
         if ((active0 & 0xfc803fb00L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x140023100L) != 0L)
            return 1;
         if ((active0 & 0xe8801ca00L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x880018200L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x608004800L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x880018200L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 45;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 35:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 37:
         return jjStopAtPos(0, 23);
      case 38:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 40:
         return jjStopAtPos(0, 48);
      case 41:
         return jjStopAtPos(0, 49);
      case 42:
         return jjStopAtPos(0, 20);
      case 43:
         jjmatchedKind = 18;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 44:
         return jjStopAtPos(0, 53);
      case 45:
         jjmatchedKind = 19;
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 46:
         return jjStopAtPos(0, 54);
      case 47:
         return jjStartNfaWithStates_0(0, 22, 10);
      case 58:
         return jjStopAtPos(0, 55);
      case 59:
         return jjStopAtPos(0, 50);
      case 60:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 61:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 62:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 91:
         return jjStopAtPos(0, 51);
      case 93:
         return jjStopAtPos(0, 52);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x200002000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x100001000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x10010000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000800L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x20000400L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x48000c000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 123:
         return jjStopAtPos(0, 46);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 125:
         return jjStopAtPos(0, 47);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         break;
      case 43:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 45:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         break;
      case 61:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000100L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 102:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(1, 29, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x8005000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000800L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 111:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x4032000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0xa00000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 124:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x400001000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x888020100L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x6800L);
      case 114:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x140000000L);
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
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
         return jjMoveStringLiteralDfa4_0(active0, 0x200000800L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 100:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 1);
         break;
      case 101:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 1);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 108:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0xc00000000L);
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 101:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(4, 27, 1);
         break;
      case 102:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 34, 1);
         break;
      case 107:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 1);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x10080L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 1);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(5, 16, 1);
         break;
      case 102:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(5, 35, 1);
         break;
      case 103:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 1);
         break;
      case 104:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(5, 31, 1);
         break;
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 1);
         break;
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(7, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 21;
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
               case 10:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(16, 17); }
                  else if (curChar == 47)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     { jjCheckNAdd(5); }
                  }
                  else if (curChar == 47)
                     { jjAddStates(3, 4); }
                  else if (curChar == 60)
                     { jjCheckNAdd(7); }
                  else if (curChar == 34)
                     { jjCheckNAdd(3); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 34)
                     { jjCheckNAdd(3); }
                  break;
               case 3:
                  if ((0x27ff506100000000L & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 4:
                  if (curChar == 34 && kind > 57)
                     kind = 57;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(5); }
                  break;
               case 6:
                  if (curChar == 60)
                     { jjCheckNAdd(7); }
                  break;
               case 7:
                  if (curChar == 46)
                     { jjCheckNAddTwoStates(7, 8); }
                  break;
               case 8:
                  if (curChar == 62 && kind > 59)
                     kind = 59;
                  break;
               case 9:
                  if (curChar == 47)
                     { jjAddStates(3, 4); }
                  break;
               case 11:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 12:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 13:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 14:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 16:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 17:
                  if (curChar == 42)
                     { jjAddStates(5, 6); }
                  break;
               case 18:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(19, 17); }
                  break;
               case 19:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(19, 17); }
                  break;
               case 20:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
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
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  { jjCheckNAdd(1); }
                  break;
               case 1:
                  if ((0x7fffffe80000000L & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  { jjCheckNAdd(1); }
                  break;
               case 3:
                  if ((0x7fffffe17fffffeL & l) != 0L)
                     { jjAddStates(7, 8); }
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjAddStates(9, 10); }
                  break;
               case 11:
                  { jjAddStates(0, 2); }
                  break;
               case 16:
                  { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 18:
               case 19:
                  { jjCheckNAddTwoStates(19, 17); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 11:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 2); }
                  break;
               case 16:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 18:
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(19, 17); }
                  break;
               default : break;
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
      if ((i = jjnewStateCnt) == (startsAt = 21 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   11, 12, 14, 10, 15, 18, 20, 3, 4, 7, 8, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\43\151\156\143\154\165\144\145", 
"\155\141\151\156", "\162\145\164\165\162\156", "\151\156\164", "\146\154\157\141\164", 
"\143\150\141\162", "\142\157\157\154", "\163\150\157\162\164", "\163\164\162\151\156\147", 
"\144\157\165\142\154\145", "\166\157\151\144", "\53", "\55", "\52", "\75", "\57", "\45", "\53\53", 
"\55\55", "\146\157\162", "\167\150\151\154\145", "\144\157", "\151\146", 
"\145\154\163\145", "\163\167\151\164\143\150", "\143\141\163\145", "\142\162\145\141\153", 
"\163\143\141\156\146", "\160\162\151\156\164\146", "\75\75", "\41\75", "\74", "\76", "\74\75", 
"\76\75", "\46", "\46\46", "\174\174", "\41", "\173", "\175", "\50", "\51", "\73", 
"\133", "\135", "\54", "\56", "\72", null, null, null, null, };
static protected Token jjFillToken()
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

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
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
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
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
         TokenLexicalActions(matchedToken);
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

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 7 :
        image.append(jjstrLiteralImages[7]);
        lengthOfMatch = jjstrLiteralImages[7].length();
                           System.out.println("LIBRERIAS -> " + image + "\u005cn");
         break;
      case 8 :
        image.append(jjstrLiteralImages[8]);
        lengthOfMatch = jjstrLiteralImages[8].length();
                   System.out.println("MAIN -> " + image + "\u005cn");
         break;
      case 9 :
        image.append(jjstrLiteralImages[9]);
        lengthOfMatch = jjstrLiteralImages[9].length();
                       System.out.println("RETURN -> " + image + "\u005cn");
         break;
      case 10 :
        image.append(jjstrLiteralImages[10]);
        lengthOfMatch = jjstrLiteralImages[10].length();
                System.out.println("INT -> " + image + "\u005cn");
         break;
      case 11 :
        image.append(jjstrLiteralImages[11]);
        lengthOfMatch = jjstrLiteralImages[11].length();
                     System.out.println("FLOAT -> " + image + "\u005cn");
         break;
      case 12 :
        image.append(jjstrLiteralImages[12]);
        lengthOfMatch = jjstrLiteralImages[12].length();
                   System.out.println("CHAR -> " + image + "\u005cn");
         break;
      case 13 :
        image.append(jjstrLiteralImages[13]);
        lengthOfMatch = jjstrLiteralImages[13].length();
                      System.out.println("BOOL -> " + image + "\u005cn");
         break;
      case 14 :
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
                     System.out.println("SHORT -> " + image + "\u005cn");
         break;
      case 15 :
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
                       System.out.println("STRING -> " + image + "\u005cn");
         break;
      case 16 :
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
                       System.out.println("DOUBLE -> " + image + "\u005cn");
         break;
      case 17 :
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
                   System.out.println("VOID -> " + image + "\u005cn");
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
               System.out.println("SUMA -> " + image + "\u005cn");
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                 System.out.println("RESTA -> " + image + "\u005cn");
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                          System.out.println("MULTIPLICACION -> " + image + "\u005cn");
         break;
      case 21 :
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
                   System.out.println("ASIGNAR -> " + image + "\u005cn");
         break;
      case 22 :
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
                    System.out.println("DIVISION -> " + image + "\u005cn");
         break;
      case 23 :
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
                  System.out.println("MODULO -> " + image + "\u005cn");
         break;
      case 24 :
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
                       System.out.println("INCREMENTO -> " + image + "\u005cn");
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
                       System.out.println("DECREMENTO -> " + image + "\u005cn");
         break;
      case 26 :
        image.append(jjstrLiteralImages[26]);
        lengthOfMatch = jjstrLiteralImages[26].length();
                System.out.println("FOR -> " + image + "\u005cn");
         break;
      case 27 :
        image.append(jjstrLiteralImages[27]);
        lengthOfMatch = jjstrLiteralImages[27].length();
                     System.out.println("WHILE -> " + image + "\u005cn");
         break;
      case 28 :
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
               System.out.println("DO -> " + image + "\u005cn");
         break;
      case 29 :
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                System.out.println("IF -> " + image + "\u005cn");
         break;
      case 30 :
        image.append(jjstrLiteralImages[30]);
        lengthOfMatch = jjstrLiteralImages[30].length();
                   System.out.println("ELSE -> " + image + "\u005cn");
         break;
      case 31 :
        image.append(jjstrLiteralImages[31]);
        lengthOfMatch = jjstrLiteralImages[31].length();
                       System.out.println("SWITCH -> " + image + "\u005cn");
         break;
      case 32 :
        image.append(jjstrLiteralImages[32]);
        lengthOfMatch = jjstrLiteralImages[32].length();
                   System.out.println("CASE -> " + image + "\u005cn");
         break;
      case 33 :
        image.append(jjstrLiteralImages[33]);
        lengthOfMatch = jjstrLiteralImages[33].length();
                     System.out.println("BREAK -> " + image + "\u005cn");
         break;
      case 34 :
        image.append(jjstrLiteralImages[34]);
        lengthOfMatch = jjstrLiteralImages[34].length();
                     System.out.println("SCANF -> " + image + "\u005cn");
         break;
      case 35 :
        image.append(jjstrLiteralImages[35]);
        lengthOfMatch = jjstrLiteralImages[35].length();
                        System.out.println("PRINTF -> " + image + "\u005cn");
         break;
      case 36 :
        image.append(jjstrLiteralImages[36]);
        lengthOfMatch = jjstrLiteralImages[36].length();
                 System.out.println("IGUAL -> " + image + "\u005cn");
         break;
      case 37 :
        image.append(jjstrLiteralImages[37]);
        lengthOfMatch = jjstrLiteralImages[37].length();
                      System.out.println("DIFERENTE -> " + image + "\u005cn");
         break;
      case 38 :
        image.append(jjstrLiteralImages[38]);
        lengthOfMatch = jjstrLiteralImages[38].length();
                 System.out.println("MENOR -> " + image + "\u005cn");
         break;
      case 39 :
        image.append(jjstrLiteralImages[39]);
        lengthOfMatch = jjstrLiteralImages[39].length();
                 System.out.println("MAYOR -> " + image + "\u005cn");
         break;
      case 40 :
        image.append(jjstrLiteralImages[40]);
        lengthOfMatch = jjstrLiteralImages[40].length();
                        System.out.println("MENOR_IGUAL -> " + image + "\u005cn");
         break;
      case 41 :
        image.append(jjstrLiteralImages[41]);
        lengthOfMatch = jjstrLiteralImages[41].length();
                        System.out.println("MAYOR_IGUAL -> " + image + "\u005cn");
         break;
      case 42 :
        image.append(jjstrLiteralImages[42]);
        lengthOfMatch = jjstrLiteralImages[42].length();
                    System.out.println("AMPERSAND -> " + image + "\u005cn");
         break;
      case 43 :
        image.append(jjstrLiteralImages[43]);
        lengthOfMatch = jjstrLiteralImages[43].length();
                System.out.println("AND -> " + image + "\u005cn");
         break;
      case 44 :
        image.append(jjstrLiteralImages[44]);
        lengthOfMatch = jjstrLiteralImages[44].length();
               System.out.println("OR -> " + image + "\u005cn");
         break;
      case 45 :
        image.append(jjstrLiteralImages[45]);
        lengthOfMatch = jjstrLiteralImages[45].length();
               System.out.println("NOT -> " + image + "\u005cn");
         break;
      case 46 :
        image.append(jjstrLiteralImages[46]);
        lengthOfMatch = jjstrLiteralImages[46].length();
                         System.out.println("LLAVE_APERTURA -> " + image + "\u005cn");
         break;
      case 47 :
        image.append(jjstrLiteralImages[47]);
        lengthOfMatch = jjstrLiteralImages[47].length();
                        System.out.println("LLAVE_CIERRE -> " + image + "\u005cn");
         break;
      case 48 :
        image.append(jjstrLiteralImages[48]);
        lengthOfMatch = jjstrLiteralImages[48].length();
                               System.out.println("PARENTESIS_APERTURA -> " + image + "\u005cn");
         break;
      case 49 :
        image.append(jjstrLiteralImages[49]);
        lengthOfMatch = jjstrLiteralImages[49].length();
                             System.out.println("PARENTESIS_CIERRE -> " + image + "\u005cn");
         break;
      case 50 :
        image.append(jjstrLiteralImages[50]);
        lengthOfMatch = jjstrLiteralImages[50].length();
                      System.out.println("PUNTO_COMA -> " + image + "\u005cn");
         break;
      case 51 :
        image.append(jjstrLiteralImages[51]);
        lengthOfMatch = jjstrLiteralImages[51].length();
                             System.out.println("CORCHETEIZQ -> " + image + "\u005cn");
         break;
      case 52 :
        image.append(jjstrLiteralImages[52]);
        lengthOfMatch = jjstrLiteralImages[52].length();
                           System.out.println("CORCHETEDER -> " + image + "\u005cn");
         break;
      case 53 :
        image.append(jjstrLiteralImages[53]);
        lengthOfMatch = jjstrLiteralImages[53].length();
                System.out.println("COMA -> " + image + "\u005cn");
         break;
      case 54 :
        image.append(jjstrLiteralImages[54]);
        lengthOfMatch = jjstrLiteralImages[54].length();
                 System.out.println("PUNTO -> " + image + "\u005cn");
         break;
      case 55 :
        image.append(jjstrLiteralImages[55]);
        lengthOfMatch = jjstrLiteralImages[55].length();
                      System.out.println("DOS_PUNTOS -> " + image + "\u005cn");
         break;
      case 56 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                  System.out.println("NOMBREVAR -> " + image + "\u005cn");
         break;
      case 57 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                                      System.out.println("CADENA -> " + image + "\u005cn");
         break;
      case 58 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                           System.out.println("NUMEROS -> " + image + "\u005cn");
         break;
      case 59 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                     System.out.println("NOMBRELIBRERIA -> " + image + "\u005cn");
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public GramaticaTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public GramaticaTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 21; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
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
   0xfffffffffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[21];
    static private final int[] jjstateSet = new int[2 * 21];

    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    
    static protected char curChar;
}
