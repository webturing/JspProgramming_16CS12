Day01:课程概述与开发环境搭建：
1.	课程概述：
a)	CoreJava
b)	Android基础
2.	环境搭建:
a)	Jdk安装（javac/java路径配置）
b)	JVM (虚拟机使得java具有跨平台优点）
c)	RTTI: RunTime Type Identification
d)	Android环境（虚拟机AVD配置）
3.	Java基本语法（控制结构，静态方法，工具类Scanner） 
a)	控制结构：
i.	常变量（布尔类型boolean)，表达式（类型转换）
ii.	分支语句:if、ifelse、ifelseif 、switch
iii.	循环:while、dowhile、for、foreach
b)	静态方法：（函数） 静态方法工厂（Math,Arrays)
c)	常用类：
i.	Scanner:nextInt()/next()/nextLine()     vs.PrintWriter
ii.	System:out/gc()/getTimeMills()/exit()   vs. Runtime
iii.	String:substring/split/contain/indexOf    vs. Calendar/Date
iv.	Math:random/sqrt/PI/E..           (vs.Arrays,Collections)
v.	Random: nextInt(int) //随机数的分布：均匀分布，正态分布..
vi.	BigInteger:add/substract/multiply.div/gcd……vs. BigDecimal
vii.	Object: hashCode()/eqauls()/toString()/clone()...
4.	编程技巧：
a)	自顶向下编程：代码模板，代码提示Alt+/
b)	快速大纲Ctrl+O
c)	视图切换Problems/Tasks/Console/Declaration
d)	代码测试，静态方法（函数）归类（类似于Math,Arrays）

 
Day02:字符串和数组
1.	数据类型：
a)	原始数据类型：boolean char(Unicode) short int long float double
b)	基本数据类型包装器：Boolean Character Short Integer Long Float Double
c)	引用数据类型（类）:数组或者非基本数据类型
d)	各种数据类型转化（以String类为中心）
2.	函数参数传递机制：f(T x)
a)	如果T是基本类型，是值传递
b)	否则就是引用传递（与被调用处为同一对象）
3.	字符串：
a)	不可变，类似于字符数组
b)	可变字符串为:StringBuilder/StringBuffer
c)	字符串运算：产生副本（效率较低）
d)	常用方法: charAt/substring/contain/startWith/split/trim/replace/compareTo…
4.	数组: Arrays    vs.Collections
a)	长度固定 a.length
b)	索引必须在[0,length-1],否则抛出ArrayIndexOutOfBoundaryException
c)	支持索引和迭代(foreach)访问
d)	Arrays类中算法：（支持各种数据类型，自定义类型需要实现Comparable接口）
i.	排序 Arrays.sort
ii.	拷贝（和System.arrayCopy类似）
iii.	二分查找 Arrays.binarySearch
iv.	参数传递为引用传递，可以作为方法的返回值。
5.	二维数组（由一维数组（的引用）为元素组成的数组）
a)	二维数组的定义
b)	二维数组的应用

	
 
Day03/04:类
1.	类基础：(构造函数，this,可见性描述符)
a)	静态（方法）变量 static method/field
b)	构造方法(constructor)与this  this()
c)	成员（方法）变量  member method/field
d)	可见性描述符visibility :
i.	private: 仅该类自己可见，
ii.	default:同一个包类可见
iii.	protected:子类可见
iv.	public：所有类都可见
e)	静态字段static与成员字段
i.	静态字段在类加载时初始化，属于整个类（所有成员都共享），用类名引用
ii.	成员字段在构造函数调用时初始化，属于对象本身(每一个对象一份)，用对象引用
f)	静态方法与成员方法：
i.	静态方法只要导入了类，都可以调用（静态方法内部只能调用静态方法）
ii.	成员方法必须在对象产生后（通常是new）后才可以使用，既可以调用成员方法也可以调用静态方法
2.	继承和多态
a)	类继承inheritance
i.	子类拥有所有父类声明为public/protected的字段，可以调用描述符为public/protected的方法
ii.	子类构造函数调用时默认在第一行添加一个super()来调用父类默认构造函数（且只调用一次）
iii.	 A  a=new B();意义为创建一个B类的对象并把引用赋值给a
1.	前提是B必须是A的子类，或者B实现了A的接口
2.	如果引用a.x则只会访问A类中的数据
3.	如果是a.f() 需要满足：
a)	类A中必须拥有方法f()的声明，可以是抽象方法
b)	调用子类f还是父类f则会根据最后一次绑定的对象类型而定(多态)
iv.	abstract/final
1.	abstract描述的方法没有方法体{},该类必须是抽象类
2.	抽象类的子类如果要实例化（生成实例，调用该类构造函数）则必须实现抽象方法，否则子类也必须声明为抽象类
3.	final 定义的变量为常量：
a)	Et .final int a=3;后a++则编译错误
b)	如果为引用类型，表示引用关系不会改变（对象本身可以数值变化）
c)	Final描述的方法不可以被子类重载
d)	Final 描述的类，不可以有子类（称为最终类）
4.	final/abstract永远不会同时修饰一个元素

3.	接口和包
a)	接口interface:
i.	全部方法都是public abstract的方法，
ii.	全部数据都是public static final数据
iii.	接口刻画了类的部分特征，比父类更灵活，更抽象，可以当成父类使用
b)	包package:
i.	按层次构建类，并解决类重名的问题，都是小写字母如com.qq.view
ii.	默认描述符描述的字段/方法，只在同一个包内可以访问
c)	匿名类和内部类
i.	定义在类A内部的类B称为内部类，其名称为A$B.class，为了提高封装性
ii.	匿名类：隐式继承/实现一个类(接口)A（一般都重载该类方法），为了提高程序的效率，如比较器和窗体鼠标消息等
4.	OO建模：//封装，继承，组合
a)	基本数据建模：分数，点，日期等
b)	数据结构建模：
i.	列表：List
1.	顺序表Vector ArrayList （栈Stack，队列Queue，单链表，双向链表LinkedList）
ii.	树:
1.	PriorityQueue
2.	TreeSet
3.	TreeMap
iii.	散列表:
1.	HashSet
2.	HashMap
iv.	图：
 
Day05: Java GUI程序设计
1.	JavaGUI程序技术概述：
a)	层次：APPLET->AWT->SWING->WEB->ANDROID
i.	AWT:  java.awt.*
1.	优点：提供了基础的控件，类似于Windows的消息机制
2.	缺点：纯java实现，界面不够美观
ii.	SWING：javax.swing.*
1.	可以应用系统提供的皮肤基本风格
2.	轻量级，
iii.	WEB/ANDROID:
1.	WEB:JSP/Struts/Spring/Hibernate
2.	ANDROID: 利用XML布局，安卓无缝原生控件，
2.	GUI程序开发方法：
a)	设计界面：(综合利用布局管理器实现复杂界面）
b)	添加消息响应和完善事件
c)	软件测试
d)	程序输出（可执行jar包）
3.	案例：计算器、扫雷等
 
Day06: Java I/O
1.	JavaIO体系：
a)	字符流
i.	输入流：Reader
1.	FileReader
2.	BufferedReader
ii.	输出流:Writer
1.	FileWriter
2.	BufferedWriter
b)	字节流
i.	输入流：InputStream
1.	FileInputStream
2.	BufferedInputStream
ii.	输出流:OutputStream
1.	FileOutputStream
2.	BufferedOutputStream
2.	Scanner/PrintWriter
i.	格式化输入流Scanner
ii.	格式化输出流PrintWriter
3.	File类
a)	File API:
i.	getName/getAbsoulutePath/isDirectory/list/…..
b)	利用File类实现：
i.	递归打印一个目录下所有文件（完整的path）
ii.	文件夹拷贝,删除,
c)	扩展学习：随机文件:RandomAccessFile类和使用
4.	综合项目：
a)	文本数据库的模拟：利用文本文件模拟数据库的插入、查找、修改、删除（理解Sqlite的基本原理）
b)	文件管理器设计：文件查找，文件夹同步
c)	ATM机模拟：（控制台版本,GUI版本）
d)	利用文件扩展GUI功能：（保存历史对局，历史排名等）
Day07:复习/测试/案例设计技巧
 
Day08:Java集合框架：
1.	集合框架概述java.util.*
a)	集合框架意义
b)	集合框架的核心技术：
i.	泛型编程
1.	class XXX<T>{}
ii.	算法和数据结构的实现
iii.	OOP的典范
c)	算法库：
i.	静态算法（用类调用）：Math/Arrays/Collections
ii.	对象算法：Random BigInteger BigDecimal
iii.	包装器：Integer Long Character	
2.	顺序表：Vector/ArrayList/Stack/LinkedList
a)	数组表：
i.	Vector
ii.	ArrayList
iii.	Stack
1.	括号匹配检测
2.	后缀式的计算
b)	LinkedList
i.	集合迭代器访问方法
ii.	Foreach
iii.	Get（index)//链表O(n),数组表为O(1)
3.	案例：双色球小游戏实现和模拟
a)	洗牌算法Collections.shuffle(List)//静态方法
b)	子列表subList
 
Day09:Java集合框架(2):
1.	Set:
a)	Set://不再支持随机访问（索引访问）
i.	基于排序树TreeSet:
1.	排序 去重 
2.	所有操作原子操作都是lg(N)
ii.	基于哈希表HashSet
1.	去重
2.	所有原子操作 O(1)
2.	Map: (keySet,valueSet)
a)	Map<K,V>
i.	基于排序树TreeMap要求键有序
ii.	基于哈系表HashMap 不保证键有序
iii.	迭代键的集合keySet(),valueSet()， EntrySet（）
3.	Queue： 
b)	PriorityQueue :（kth查询比较高效）
i.	保证所有操作都是log(n)
c)	ArrayQueue
4.	案例建模：
i.	字符串统计,键值互转
ii.	利用Map实现电话本操作
iii.	利用Map实现数据库的模拟（登录验证）
iv.	二叉树建模：BinaryTree
v.	图建模：TreeMap<Integer,Vector<Integer>> graph;
5.	总结：
d)	深入理解Java泛型思想
e)	掌握集合排序、各种数据结构操作
f)	利用集合框架提升建模和编程能力
 
Day10: 异常和多线程
1.	复习：CoreJava补充部分：
a)	用Map实现字典
b)	JavaGUI
i.	绘图实现
ii.	GUI程序的MVC的开发模式
1.	Model：数据的计算模型（引擎）
2.	View：应用的界面
3.	Controller:采集用户数据，完成Model和View的交互
2.	异常Exception 
a)	错误分类：
i.	Error:不需要程序员去处理的程序故障（如虚拟机崩溃）
ii.	Exception:需要程序员去处理的程序故障，以便程序可以恢复继续执行
1.	网络/数据库/文件
2.	运行时错误: 空指针异常，类型转换，数组越界，
3.	F抛出异常则调用该方法的所有方法必须：
a)	抛出异常
b)	或者处理该异常(try{}catch)
b)	Try catch finally的用法
c)	结论:
i.	try{}catch比throw方法抛出异常更好（更自律）
ii.	throw在方法内部可以不受方法返回值影响
3.	多线程	
a)	多线程概念：
i.	提高CPU利用率
ii.	提升用户软件体验
b)	Java实现多线程的方法
i.	继承Thread
ii.	实现Runnable接口	(灵活，便于共享变量，强烈推荐)
c)	多线程同步：
i.	同一资源的并发访问
ii.	死锁
iii.	加锁，使用，等待，
d)	应用：
i.	系统的时钟
 
Day11：		设计模式初步
1.	设计模式概述：（易于扩展的软件结构设计技巧）
a)	方法参数虚化，
b)	成员字段：类虚化
c)	灵活使用OOP:
i.	区分is-a/ has-a/like-a/use-a的差别
ii.	接口和抽象类
d)	OOP设计的精髓（模板）Gof23：23种设计模式
2.	静态工厂模式（类似于C的函数库）
a)	方法都是静态方法
b)	构造函数私有
c)	所有开放的方法都用静态方法引用
d)	如Math,Arrays,Collections
3.	单例模式实现
class Singleton{
private static Singleton instance=null;// (b)
private Singleton(){}//(a)
public static Singleton getInstance(){//(c)
	if(instance==null)
instance=new Singleton();
return instance;
}
}
a)	构造函数私有
b)	私有的全局唯一实例
c)	通过getInstance()静态方法获得该实例
d)	如Runtime  Calendar
 
Day12 Review(End of CoreJava)
1.	CoreJava补遗：
a)	Java对象引用与常量管理
Int [] f()
{
Int a[] ={1,2,3};
Return a;
}
Int [] g=f();

b)	Serializable 序列化与反序列化
Class A implements Serializable{}
i.	序列化，把内存中的对象按字节写入文件
ii.	反序列化：用文件中的字节来创建一个内存对象
2.	设计模式之责任链模式设计：
3.	

