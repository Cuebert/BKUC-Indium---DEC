.class Lc7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field public static final a:Lc7/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc7/e$a;

    invoke-direct {v0}, Lc7/e$a;-><init>()V

    invoke-virtual {v0}, Lc7/e$a;->a()Lc7/e;

    move-result-object v0

    sput-object v0, Lc7/c$a;->a:Lc7/e;

    return-void
.end method
