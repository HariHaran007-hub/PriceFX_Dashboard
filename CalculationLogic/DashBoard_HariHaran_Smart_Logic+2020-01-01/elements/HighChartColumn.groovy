def seriesData = [
        [
                name: 'Result Price',
                data: out.HighChartColumnData?.resultPrice //list of yAxis values, or list of maps with y value
        ], [
                name: 'Discount Price',
//                data: [[y: 1], [y: 9], [y: 3]]
                data: out.HighChartColumnData?.discount
        ],
]

def definition = [
        chart      : [
                type: 'column'
        ],

        title      : [
                text: 'Column chart for products'
        ],

        subtitle   : [
                text: 'Take a look at result price'
        ],

        series     : seriesData,

        plotOptions: [
                column: [
                        dataLabels: [
                                enabled: true
                        ]
                ]
        ],

        colors     : [
                '#ff3385',//->first bar color
                '#ff9900',//->second bar color
        ],

        tooltip    : [
                headerFormat: '{point.x}',
                pointFormat : '{series.name}: <b>{point.y}</b>'
        ],
        xAxis      : [
                categories: out.HighChartColumnData?.categoryData,
                title     : [
                        text: 'Product ID'
                ]
        ],

        yAxis      : [
                title: [
                        text: 'Result Price'
                ]
        ],

        credits    : [
                enabled: false
        ],
]

return api.buildHighchart(definition)
