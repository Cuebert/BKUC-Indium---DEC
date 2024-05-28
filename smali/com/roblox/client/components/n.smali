.class public Lcom/roblox/client/components/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:I = 0x0

.field public static c:I = 0x1

.field public static d:I = 0x2


# instance fields
.field protected a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Lcom/roblox/client/components/n;->b:I

    iput v0, p0, Lcom/roblox/client/components/n;->a:I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/roblox/client/components/n;->a:I

    return-void
.end method

.method public b(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget v0, p0, Lcom/roblox/client/components/n;->a:I

    sget v1, Lcom/roblox/client/components/n;->b:I

    const/4 v2, 0x1

    if-le v0, v1, :cond_1

    .line 2
    sget v1, Lcom/roblox/client/components/n;->c:I

    const/4 v3, 0x0

    const-string v4, "rbx.input"

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getFlags()I

    move-result v0

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    const-string p1, "WINDOW_IS_OBSCURED"

    .line 3
    invoke-static {v4, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    .line 4
    :cond_0
    iget v0, p0, Lcom/roblox/client/components/n;->a:I

    sget v1, Lcom/roblox/client/components/n;->d:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getFlags()I

    move-result p1

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_1

    const-string p1, "WINDOW_IS_PARTIALLY_OBSCURED"

    .line 5
    invoke-static {v4, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_1
    return v2
.end method
