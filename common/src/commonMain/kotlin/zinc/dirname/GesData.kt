package zinc.dirname

/**
 * @作者 做就行了！
 * @时间 2021/12/18 下午11:31
 * @该类描述： -
 * @使用说明： -
 */
value class GesData(val i: Int) {
  companion object {
    /**
     * 4位
     */
    val ORIEN_GES_MASK = 0xf shl 8
    
    /**
     * 3位
     */
    val ORDER_GES_PTR_COUNT_MASK = 0x7 shl 5
    
    /**
     * 1位
     */
    val ORIEN_GES_TYPE1_MASK = 0x1 shl 4
    
    /**
     * 4位
     */
    val ORIEN_GES_TYPE2_MASK = 0xf
  }
  
  val orienGes: Int
    get() = i and ORIEN_GES_MASK
  val orderGesPtrCount: Int
    get() = i and ORDER_GES_PTR_COUNT_MASK
  val orderGesType1: Int
    get() = i and ORIEN_GES_TYPE1_MASK
  val orderGesType2: Int
    get() = i and ORIEN_GES_TYPE2_MASK
}