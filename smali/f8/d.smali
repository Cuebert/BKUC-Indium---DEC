.class public Lf8/d;
.super Le8/h;
.source "SourceFile"

# interfaces
.implements Le8/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/d$b;
    }
.end annotation


# instance fields
.field public final n:Lf8/d$b;

.field public final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lf8/d$b;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le8/h;-><init>()V

    .line 2
    iput-object p1, p0, Lf8/d;->n:Lf8/d$b;

    .line 3
    iput-object p2, p0, Lf8/d;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Lf8/d;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    sget v0, Lcom/roblox/client/c0;->r3:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    sget-object v0, Lf8/d$a;->a:[I

    iget-object v1, p0, Lf8/d;->n:Lf8/d$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 3
    sget v0, Lcom/roblox/client/c0;->p4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :pswitch_0
    sget v0, Lcom/roblox/client/c0;->n4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 5
    :pswitch_1
    sget v0, Lcom/roblox/client/c0;->p4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 6
    :pswitch_2
    sget v0, Lcom/roblox/client/c0;->w4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 7
    :pswitch_3
    sget v0, Lcom/roblox/client/c0;->v4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 8
    :pswitch_4
    sget v0, Lcom/roblox/client/c0;->m4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 9
    :pswitch_5
    sget v0, Lcom/roblox/client/c0;->p4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 10
    :pswitch_6
    sget v0, Lcom/roblox/client/c0;->o4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 11
    :pswitch_7
    sget v0, Lcom/roblox/client/c0;->r4:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, Lf8/d;->n:Lf8/d$b;

    sget-object v1, Lf8/d$b;->n:Lf8/d$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Lf8/d$b;->x:Lf8/d$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e()Z
    .locals 4

    sget-object v0, Lf8/d$a;->a:[I

    iget-object v1, p0, Lf8/d;->n:Lf8/d$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 v3, 0x5

    if-eq v0, v3, :cond_0

    const/4 v3, 0x7

    if-eq v0, v3, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf8/d;->o:Ljava/lang/String;

    return-object v0
.end method
