.class abstract Lb5/s;
.super Ld5/y;
.source "SourceFile"


# instance fields
.field final synthetic o:Lb5/t;


# direct methods
.method constructor <init>(Lb5/t;Lg4/m;)V
    .locals 0

    iput-object p1, p0, Lb5/s;->o:Lb5/t;

    invoke-direct {p0, p2}, Ld5/y;-><init>(Lg4/m;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    instance-of v0, p1, Ld5/e;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Ld5/y;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v0, p0, Lb5/s;->o:Lb5/t;

    .line 2
    invoke-static {v0}, Lb5/t;->g(Lb5/t;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Lb5/b;

    const/4 v1, -0x2

    invoke-direct {v0, v1, p1}, Lb5/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Ld5/y;->a(Ljava/lang/Exception;)V

    return-void

    .line 4
    :cond_1
    new-instance v0, Lb5/b;

    const/16 v1, -0x9

    invoke-direct {v0, v1, p1}, Lb5/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Ld5/y;->a(Ljava/lang/Exception;)V

    return-void
.end method
