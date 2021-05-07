import axios from 'axios'
import Chart from 'react-apexcharts'
import { SaleSum } from 'types/sale'
import { BASE_URL } from 'utils/requests'


type ChartData = {
  labels: string[],
  series: number[]
}


const DonutChart = () => {

  let chartData: ChartData = { labels: [], series: [] }
  axios.get<SaleSum[]>(`${BASE_URL}/sales/amount-by-seller`).then(req => {
    req.data.map(data => {
      chartData.series.push(data.sum)
      chartData.labels.push(data.sellerName)
    })
  })

  const options = {
    legend: {
      show: true
    }
  }

  return (
    <>
      <Chart
        options={{ ...options, labels: chartData.labels }}
        series={chartData.series} type="donut" height="240" />
    </>
  )
}

export default DonutChart