.class public final Lg4/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field static final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg4/m0;

    invoke-direct {v0}, Lg4/m0;-><init>()V

    sput-object v0, Lg4/n;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lg4/l0;

    invoke-direct {v0}, Lg4/l0;-><init>()V

    sput-object v0, Lg4/n;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
