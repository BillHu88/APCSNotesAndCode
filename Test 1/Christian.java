public class Christian{
	
	public static void main(String[] args){
		//String test = scroll("Christian");
		//int test = myIndexOf("hellooo", 'o', 1);
		//boolean test = areSame("abababab");
		//System.out.println(test);
	}
	public static String scroll(String str){
		char fChar = str.charAt(0);
		String subStr = str.substring(1);
		String newStr = subStr+fChar;
		return newStr;
	}
	public static boolean areSame(String str){
		char first = str.charAt(0);
		String a = str.replace('a',first);
		String b = a.replace('b',first);
		String c = b.replace('c',first);
		String d = c.replace('d',first);
		String e = d.replace('e',first);
		String f = e.replace('f',first);
		String g = f.replace('g',first);
		String h = g.replace('h',first);
		String i = h.replace('i',first);
		String j = i.replace('j',first);
		String k = j.replace('k',first);
		String l = k.replace('l',first);
		String m = l.replace('m',first);
		String n = m.replace('n',first);
		String o = n.replace('o',first);
		String p = o.replace('p',first);
		String q = p.replace('q',first);
		String r = q.replace('r',first);
		String s = r.replace('s',first);
		String t = s.replace('t',first);
		String u = t.replace('u',first);
		String v = u.replace('v',first);
		String w = v.replace('w',first);
		String x = w.replace('x',first);
		String y = x.replace('y',first);
		String end = y.replace('z',first);
		if(str.equals(end)){
			return true;
		}
		else{
			return false;
		}
	}
	public static int myIndexOf(String str, char ch, int fromPos){
		int index=0;
		String subStr = str.substring(fromPos);
		for(int i = 0;i<=(str.length()-1);i++){
			if(subStr.charAt(i)==ch){
				index = i;
				break;
			}
			else{

			}
		}
		int diff = (str.length()-1)-(subStr.length()-1);
		index+=diff;
		return index;
	}
}