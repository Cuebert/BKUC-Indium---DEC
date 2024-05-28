.class public Lu1/g;
.super Lt1/b;
.source "SourceFile"


# instance fields
.field private d:Ljava/lang/Object;

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt1/g;->u:Lt1/g;

    invoke-direct {p0, v0}, Lt1/b;-><init>(Lt1/g;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/g;->d:Ljava/lang/Object;

    return-void
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lu1/g;->e:J

    return-wide v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu1/g;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public e(J)V
    .locals 0

    iput-wide p1, p0, Lu1/g;->e:J

    return-void
.end method

.method public f(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lu1/g;->d:Ljava/lang/Object;

    return-void
.end method
