def gcd(a, b)
  return a.abs if b == 0
  gcd(b, a % b)
end

def find_gcd(arr)
  n = arr.length

  for i in 0..n-1 do
    arr[i] = arr[i].abs
  end

  for i in 0..n-2 do
    if arr[i] != 0
      while arr[i] != 0
        if arr[i] < arr[i+1]
          arr[i+1] %= arr[i]
        else
          temp = arr[i]
          arr[i] = arr[i+1]
          arr[i+1] = temp
        end
      end
    end
  end
end

n = gets.to_i
arr = []

for i in 0..n-1 do
  num = gets.to_i
  arr << num
end

find_gcd(arr)