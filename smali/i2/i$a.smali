.class final Li2/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Li2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/i;

    invoke-direct {v0}, Li2/i;-><init>()V

    sput-object v0, Li2/i$a;->a:Li2/i;

    return-void
.end method

.method static synthetic a()Li2/i;
    .locals 1

    sget-object v0, Li2/i$a;->a:Li2/i;

    return-object v0
.end method
