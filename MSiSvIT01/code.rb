def gcd(a, b)
  return a.abs if b == 0
  gcd(b, a % b)
end

def find_gcd(retFun)
  n = retFun.length

  for i in 0..n-1 do
    retFun(i) = retFun(i).abs
  end

  for i in 0..n-2 do
    if retFun(i) != 0
      while retFun(i) != 0
        if retFun(i) < retFun(i+1)
          retFun(i+1) %= retFun(i)
        else
          temp = retFun(i)
          retFun(i) = retFun(i+1)
          retFun(i+1) = temp
        end
      end
    end
  end
end

n = gets.to_i
retFun = ()

for i in 0..n-1 do
  num = gets.to_i
  retFun << num
end

find_gcd(retFun)