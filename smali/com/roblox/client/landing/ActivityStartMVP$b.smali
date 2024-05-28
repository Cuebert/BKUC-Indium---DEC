.class Lcom/roblox/client/landing/ActivityStartMVP$b;
.super Landroidx/fragment/app/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/landing/ActivityStartMVP;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final j:[Lcom/roblox/client/landing/a;

.field final synthetic k:Lcom/roblox/client/landing/ActivityStartMVP;


# direct methods
.method private constructor <init>(Lcom/roblox/client/landing/ActivityStartMVP;Landroidx/fragment/app/FragmentManager;[Lcom/roblox/client/landing/a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/landing/ActivityStartMVP$b;->k:Lcom/roblox/client/landing/ActivityStartMVP;

    .line 3
    invoke-direct {p0, p2}, Landroidx/fragment/app/r;-><init>(Landroidx/fragment/app/FragmentManager;)V

    .line 4
    iput-object p3, p0, Lcom/roblox/client/landing/ActivityStartMVP$b;->j:[Lcom/roblox/client/landing/a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/client/landing/ActivityStartMVP;Landroidx/fragment/app/FragmentManager;[Lcom/roblox/client/landing/a;Lcom/roblox/client/landing/ActivityStartMVP$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/client/landing/ActivityStartMVP$b;-><init>(Lcom/roblox/client/landing/ActivityStartMVP;Landroidx/fragment/app/FragmentManager;[Lcom/roblox/client/landing/a;)V

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP$b;->j:[Lcom/roblox/client/landing/a;

    array-length v0, v0

    return v0
.end method

.method public p(I)Landroidx/fragment/app/Fragment;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/landing/ActivityStartMVP$b;->j:[Lcom/roblox/client/landing/a;

    aget-object p1, v0, p1

    invoke-static {p1}, Lcom/roblox/client/landing/b;->X1(Lcom/roblox/client/landing/a;)Lcom/roblox/client/landing/b;

    move-result-object p1

    return-object p1
.end method
