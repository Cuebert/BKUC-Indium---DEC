.class final Lb5/z;
.super Lb5/c$a$a;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:B


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb5/c$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lb5/c$a;
    .locals 4

    iget-byte v0, p0, Lb5/z;->b:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lb5/b0;

    iget-wide v1, p0, Lb5/z;->a:J

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lb5/b0;-><init>(JLb5/a0;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties: cloudProjectNumber"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(J)Lb5/c$a$a;
    .locals 0

    iput-wide p1, p0, Lb5/z;->a:J

    const/4 p1, 0x1

    iput-byte p1, p0, Lb5/z;->b:B

    return-object p0
.end method
