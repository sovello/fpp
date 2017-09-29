public class RecursiveMerge {

    public int[] merge(int[] arr1, int[] arr2){
	if(arr1 == null) return arr2;
	if(arr2 == null) return arr1;
	int len1 = arr1.length;
	int len2 = arr2.length;
	int[] retVal = new int[len1+len2];

	return recursiveMerge(retVal,0,arr1, arr2);
    }

    //Note: the code for the method remove0th is not shown

    private int[] recursiveMerge(int[] returnVal, int nextAvailPos,
				 int[] first, int[] second){
	if(first.length == 0){
	    System.arraycopy(second,0,returnVal,nextAvailPos,second.length);
	    return returnVal;
	}

	if(second.length==0){
	    System.arraycopy(first,0,returnVal, nextAvailPos,first.length);
	    return returnVal;
	}
	
	if(// FIXME: rst[0] <= second[0]){
	   returnVal[nextAvailPos] = first[0];
	   return recursiveMerge(returnVal, nextAvailPos +1, remove0th(first),second);
	}
	else {
	    returnVal[nextAvailPos] = second[0];
	    return recursiveMerge(returnVal, nextAvailPos +1, first,remove0th(second));
	}
    }
    
    /**
       sample usage:
       int[] arr1 = {1,3,5,7,9,11,13};
       int[] arr2 = {2,4,6,8,10,12,14,16,18,20};
       Merge m = new Merge();
       int[] result = m.merge(arr1,arr2);
    */
}
