/* GramaticaTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. GramaticaTokenManager.java */
package Lenguaje;

/** Token Manager. */
@SuppressWarnings("unused")public class GramaticaTokenManager implements GramaticaConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400000L) != 0L)
            return 10;
         if ((active0 & 0x3ff00003ff00L) != 0L)
         {
            jjmatchedKind = 56;
            return 1;
         }
         if ((active0 & 0x50000000L) != 0L)
            return 7;
         return -1;
      case 1:
         if ((active0 & 0xc000010000L) != 0L)
            return 1;
         if ((active0 & 0x3f300002ff00L) != 0L)
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
         if ((active0 & 0x1000000400L) != 0L)
            return 1;
         if ((active0 & 0x3f200003fb00L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x50000023100L) != 0L)
            return 1;
         if ((active0 & 0x3a200001ca00L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x220000018200L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x182000004800L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x220000018200L) != 0L)
            return 1;
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
      case 33:
         jjmatchedKind = 35;
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 35:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 37:
         return jjStopAtPos(0, 23);
      case 38:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x200000000L);
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
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 61:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 62:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 91:
         return jjStopAtPos(0, 51);
      case 93:
         return jjStopAtPos(0, 52);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x80000002000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x40000001000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x4000010000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x1000000800L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8000000400L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x12000000c000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 123:
         return jjStopAtPos(0, 46);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 125:
         return jjStopAtPos(0, 47);
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
      case 38:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
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
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000100L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 70:
      case 102:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 39, 1);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000005000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000800L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 79:
      case 111:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x1000032000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x280000000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 124:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         break;
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
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000001000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x222000020100L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x6800L);
      case 82:
      case 114:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x50000000000L);
      case 84:
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
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
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000800L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 68:
      case 100:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 1);
         break;
      case 69:
      case 101:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 40, 1);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 42, 1);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 76:
      case 108:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      case 78:
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x300000000000L);
      case 82:
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
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
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L);
      case 69:
      case 101:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 37, 1);
         break;
      case 70:
      case 102:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 44, 1);
         break;
      case 75:
      case 107:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 43, 1);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x10080L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 84:
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 1);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000000L);
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
      case 69:
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(5, 16, 1);
         break;
      case 70:
      case 102:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 45, 1);
         break;
      case 71:
      case 103:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 1);
         break;
      case 72:
      case 104:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 41, 1);
         break;
      case 78:
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 1);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
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
      case 68:
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
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
      case 69:
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(7, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
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
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
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
                  if ((0x3ff100000000000L & l) == 0L)
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
                  if ((0x7fffffe87fffffeL & l) == 0L)
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
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, "\53", "\55", "\52", "\75", "\57", "\45", "\53\53", 
"\55\55", "\75\75", "\41\75", "\74", "\76", "\74\75", "\76\75", "\46", "\46\46", 
"\174\174", "\41", null, null, null, null, null, null, null, null, null, null, "\173", 
"\175", "\50", "\51", "\73", "\133", "\135", "\54", "\56", "\72", null, null, null, 
null, };
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

void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 7 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                          System.out.println("LIBRERIA -> " + image + "\u005cn");
         break;
      case 8 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   System.out.println("MAIN -> " + image + "\u005cn");
         break;
      case 9 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                       System.out.println("RETURN -> " + image + "\u005cn");
         break;
      case 10 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                System.out.println("INT -> " + image + "\u005cn");
         break;
      case 11 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                     System.out.println("FLOAT -> " + image + "\u005cn");
         break;
      case 12 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   System.out.println("CHAR -> " + image + "\u005cn");
         break;
      case 13 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   System.out.println("BOOL -> " + image + "\u005cn");
         break;
      case 14 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                     System.out.println("SHORT -> " + image + "\u005cn");
         break;
      case 15 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                       System.out.println("STRING -> " + image + "\u005cn");
         break;
      case 16 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                       System.out.println("DOUBLE -> " + image + "\u005cn");
         break;
      case 17 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
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
                       System.out.println("MULTIPLICAR -> " + image + "\u005cn");
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
                 System.out.println("IGUAL -> " + image + "\u005cn");
         break;
      case 27 :
        image.append(jjstrLiteralImages[27]);
        lengthOfMatch = jjstrLiteralImages[27].length();
                      System.out.println("DIFERENTE -> " + image + "\u005cn");
         break;
      case 28 :
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
                 System.out.println("MENOR -> " + image + "\u005cn");
         break;
      case 29 :
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                 System.out.println("MAYOR -> " + image + "\u005cn");
         break;
      case 30 :
        image.append(jjstrLiteralImages[30]);
        lengthOfMatch = jjstrLiteralImages[30].length();
                       System.out.println("MENORIGUAL -> " + image + "\u005cn");
         break;
      case 31 :
        image.append(jjstrLiteralImages[31]);
        lengthOfMatch = jjstrLiteralImages[31].length();
                       System.out.println("MAYORIGUAL -> " + image + "\u005cn");
         break;
      case 32 :
        image.append(jjstrLiteralImages[32]);
        lengthOfMatch = jjstrLiteralImages[32].length();
                    System.out.println("AMPERSAND -> " + image + "\u005cn");
         break;
      case 33 :
        image.append(jjstrLiteralImages[33]);
        lengthOfMatch = jjstrLiteralImages[33].length();
                System.out.println("AND -> " + image + "\u005cn");
         break;
      case 34 :
        image.append(jjstrLiteralImages[34]);
        lengthOfMatch = jjstrLiteralImages[34].length();
               System.out.println("OR -> " + image + "\u005cn");
         break;
      case 35 :
        image.append(jjstrLiteralImages[35]);
        lengthOfMatch = jjstrLiteralImages[35].length();
               System.out.println("NOT -> " + image + "\u005cn");
         break;
      case 36 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                     System.out.println("CICLOFOR -> " + image + "\u005cn");
         break;
      case 37 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                          System.out.println("CICLOWHILE -> " + image + "\u005cn");
         break;
      case 38 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                    System.out.println("CICLODO -> " + image + "\u005cn");
         break;
      case 39 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                System.out.println("IF -> " + image + "\u005cn");
         break;
      case 40 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   System.out.println("ELSE -> " + image + "\u005cn");
         break;
      case 41 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                       System.out.println("SWITCH -> " + image + "\u005cn");
         break;
      case 42 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   System.out.println("CASE -> " + image + "\u005cn");
         break;
      case 43 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                     System.out.println("BREAK -> " + image + "\u005cn");
         break;
      case 44 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                     System.out.println("SCANF -> " + image + "\u005cn");
         break;
      case 45 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                        System.out.println("PRINTF -> " + image + "\u005cn");
         break;
      case 46 :
        image.append(jjstrLiteralImages[46]);
        lengthOfMatch = jjstrLiteralImages[46].length();
                   System.out.println("LLAVEIZQ -> " + image + "\u005cn");
         break;
      case 47 :
        image.append(jjstrLiteralImages[47]);
        lengthOfMatch = jjstrLiteralImages[47].length();
                    System.out.println("LLAVEDER -> " + image + "\u005cn");
         break;
      case 48 :
        image.append(jjstrLiteralImages[48]);
        lengthOfMatch = jjstrLiteralImages[48].length();
                     System.out.println("PARENTIZQ -> " + image + "\u005cn");
         break;
      case 49 :
        image.append(jjstrLiteralImages[49]);
        lengthOfMatch = jjstrLiteralImages[49].length();
                     System.out.println("PARENTDER -> " + image + "\u005cn");
         break;
      case 50 :
        image.append(jjstrLiteralImages[50]);
        lengthOfMatch = jjstrLiteralImages[50].length();
                   System.out.println("SENTFIN -> " + image + "\u005cn");
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
                    System.out.println("DOSPUNTO -> " + image + "\u005cn");
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
                          System.out.println("NUMERO -> " + image + "\u005cn");
         break;
      case 59 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                     System.out.println("NOMBRELIBRERIA -> " + image + "\u005cn");
         break;
      default :
         break;
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
    public GramaticaTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public GramaticaTokenManager (SimpleCharStream stream, int lexState){
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
    for (i = 21; i-- > 0;)
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
   0xfffffffffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[21];
    private final int[] jjstateSet = new int[2 * 21];

    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    
    protected char curChar;
}
