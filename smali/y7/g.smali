.class public Ly7/g;
.super Ly7/h;
.source "SourceFile"


# instance fields
.field private h:I


# direct methods
.method public constructor <init>(Lcom/roblox/client/t0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly7/h;-><init>(Lcom/roblox/client/t0;)V

    .line 2
    invoke-direct {p0, p2}, Ly7/g;->g(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ly7/g;->h:I

    return-void
.end method

.method private g(Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "group"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "players"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "player"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "groups"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 2
    invoke-super {p0}, Ly7/h;->b()I

    move-result p1

    return p1

    :pswitch_0
    return v1

    :pswitch_1
    const/4 p1, 0x5

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x49c2262c -> :sswitch_3
        -0x3ac1651f -> :sswitch_2
        -0x1d6b3e4e -> :sswitch_1
        0x5e0f67f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ly7/g;->h:I

    return v0
.end method
