.class public final synthetic Lp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/p2$c;


# static fields
.field public static final synthetic a:Lp/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lp/c;

    invoke-direct {v0}, Lp/c;-><init>()V

    sput-object v0, Lp/c;->a:Lp/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lw/p2;
    .locals 0

    invoke-static {p1}, Landroidx/camera/camera2/Camera2Config;->a(Landroid/content/Context;)Lw/p2;

    move-result-object p1

    return-object p1
.end method
