.class public Lh7/d;
.super Lh7/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh7/l;[Lh7/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p4, p5}, Lh7/a;-><init>(Ljava/lang/String;Lh7/l;[Lh7/b$a;)V

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, ""

    .line 2
    :goto_0
    iput-object p2, p0, Lh7/a;->e:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lh7/a;->f:Ljava/lang/String;

    return-void
.end method
