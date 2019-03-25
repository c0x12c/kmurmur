package chan.murmur

enum class Murmur {
  ONE {
    override fun hash(data: ByteArray, length: Int, seed: Long): Long {
      return One.hash(data, length, seed)
    }
  },
  TWO {
    override fun hash(data: ByteArray, length: Int, seed: Long): Long {
      return Two.hash(data, length, seed)
    }
  },
  THREE {
    override fun hash(data: ByteArray, length: Int, seed: Long): Long {
      return Three.hash86b32(data, length, seed)
    }
  };

  abstract fun hash(data: ByteArray, length: Int, seed: Long): Long
}
