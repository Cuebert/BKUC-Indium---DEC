.class public Le7/h$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roblox/client/v;->s:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Le7/h$d;->a:I

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/v;->q:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Le7/h$d;->b:I

    return-void
.end method


# virtual methods
.method public a(Ly8/f;)I
    .locals 1

    .line 1
    sget-object v0, Le7/h$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 2
    iget p1, p0, Le7/h$d;->a:I

    return p1

    .line 3
    :cond_0
    iget p1, p0, Le7/h$d;->b:I

    return p1
.end method
