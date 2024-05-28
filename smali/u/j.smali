.class public Lu/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lt/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-class v0, Lt/o;

    invoke-static {v0}, Lt/l;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v0

    check-cast v0, Lt/o;

    invoke-direct {p0, v0}, Lu/j;-><init>(Lt/o;)V

    return-void
.end method

.method constructor <init>(Lt/o;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lu/j;->a:Lt/o;

    return-void
.end method


# virtual methods
.method public a(Landroid/util/Size;)Landroid/util/Size;
    .locals 4

    .line 1
    iget-object v0, p0, Lu/j;->a:Lt/o;

    if-nez v0, :cond_0

    return-object p1

    .line 2
    :cond_0
    sget-object v1, Lw/h2$b;->n:Lw/h2$b;

    invoke-virtual {v0, v1}, Lt/o;->a(Lw/h2$b;)Landroid/util/Size;

    move-result-object v0

    if-nez v0, :cond_1

    return-object p1

    .line 3
    :cond_1
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v2

    mul-int v1, v1, v2

    .line 4
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v2

    .line 5
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v3

    mul-int v2, v2, v3

    if-le v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    move-object p1, v0

    :cond_3
    return-object p1
.end method
