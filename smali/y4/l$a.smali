.class Ly4/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Ly4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly4/l;

    invoke-direct {v0}, Ly4/l;-><init>()V

    sput-object v0, Ly4/l$a;->a:Ly4/l;

    return-void
.end method
