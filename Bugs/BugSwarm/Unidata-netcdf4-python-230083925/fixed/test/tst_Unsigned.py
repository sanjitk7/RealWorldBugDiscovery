import unittest
import netCDF4
from numpy.testing import assert_array_equal
import numpy as np

class Test_Unsigned(unittest.TestCase):
    def test_unsigned(self):
        f = netCDF4.Dataset("ubyte.nc3")
        data = f['ub'][:]
        assert data.dtype.str[1:] == 'u1'
        assert_array_equal(data,np.array([0,255],np.uint8))
        f.close()

if __name__ == '__main__':
    unittest.main()
