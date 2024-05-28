.class public final synthetic Lp/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/a0$a;


# static fields
.field public static final synthetic a:Lp/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lp/b;

    invoke-direct {v0}, Lp/b;-><init>()V

    sput-object v0, Lp/b;->a:Lp/b;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lw/h0;Landroidx/camera/core/s;)Lw/a0;
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/v;

    invoke-direct {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/v;-><init>(Landroid/content/Context;Lw/h0;Landroidx/camera/core/s;)V

    return-object v0
.end method
