.class final Lt3/c2;
.super Lt3/e2;
.source "SourceFile"


# instance fields
.field private final b:[B

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method synthetic constructor <init>([BIIZLt3/b2;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p2}, Lt3/e2;-><init>(Lt3/d2;)V

    const p2, 0x7fffffff

    iput p2, p0, Lt3/c2;->e:I

    iput-object p1, p0, Lt3/c2;->b:[B

    const/4 p1, 0x0

    iput p1, p0, Lt3/c2;->c:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/g2;
        }
    .end annotation

    iget p1, p0, Lt3/c2;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lt3/c2;->e:I

    iget v1, p0, Lt3/c2;->c:I

    iget v2, p0, Lt3/c2;->d:I

    add-int/2addr v1, v2

    iput v1, p0, Lt3/c2;->c:I

    if-lez v1, :cond_0

    iput v1, p0, Lt3/c2;->d:I

    sub-int/2addr v1, v1

    iput v1, p0, Lt3/c2;->c:I

    goto :goto_0

    :cond_0
    iput v0, p0, Lt3/c2;->d:I

    :goto_0
    return p1
.end method
