.class public Lu1/k;
.super Lt1/b;
.source "SourceFile"


# instance fields
.field private d:I

.field private e:Lv1/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt1/g;->z:Lt1/g;

    invoke-direct {p0, v0}, Lt1/b;-><init>(Lt1/g;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/k;->e:Lv1/a;

    return-void
.end method

.method public c()Lv1/a;
    .locals 1

    iget-object v0, p0, Lu1/k;->e:Lv1/a;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu1/k;->d:I

    return v0
.end method

.method public e(ILv1/a;)V
    .locals 0

    .line 1
    iput p1, p0, Lu1/k;->d:I

    .line 2
    iput-object p2, p0, Lu1/k;->e:Lv1/a;

    return-void
.end method
