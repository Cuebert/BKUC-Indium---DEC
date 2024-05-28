.class Lk1/p$b;
.super Lk1/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Lk1/p;


# direct methods
.method constructor <init>(Lk1/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk1/m;-><init>()V

    .line 2
    iput-object p1, p0, Lk1/p$b;->a:Lk1/p;

    return-void
.end method


# virtual methods
.method public b(Lk1/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk1/p$b;->a:Lk1/p;

    iget v1, v0, Lk1/p;->Y:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lk1/p;->Y:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, v0, Lk1/p;->Z:Z

    .line 3
    invoke-virtual {v0}, Lk1/l;->t()V

    .line 4
    :cond_0
    invoke-virtual {p1, p0}, Lk1/l;->Z(Lk1/l$f;)Lk1/l;

    return-void
.end method

.method public c(Lk1/l;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk1/p$b;->a:Lk1/p;

    iget-boolean v0, p1, Lk1/p;->Z:Z

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lk1/l;->k0()V

    .line 3
    iget-object p1, p0, Lk1/p$b;->a:Lk1/p;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lk1/p;->Z:Z

    :cond_0
    return-void
.end method
