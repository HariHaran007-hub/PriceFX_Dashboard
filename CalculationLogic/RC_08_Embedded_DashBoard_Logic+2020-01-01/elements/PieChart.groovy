Map container =
        [chart        : [plotBackgroundColor: null,
                         plotBorderWidth    : null,
                         plotShadow         : false,
                         type               : 'pie',],
         title        : [text: 'Result ',],
         tooltip      : [pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'],
         accessibility: [point: [valueSuffix: '%',]],
         plotOptions  : [pie: [allowPointSelect: true,
                               cursor          : 'pointer',
                               dataLabels      : [enabled: true,
                                                  format : '<b>{point.name}</b>: {point.percentage:.1f} %']]],
         series       : [[name        : 'Product Sku',
                          colorByPoint: true,
                          data        : out.PieChartData

                         ],]]

return api.buildHighchart(container)